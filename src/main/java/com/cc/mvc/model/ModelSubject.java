package com.cc.mvc.model;

import com.cc.mvc.view.ViewComponent;

import java.util.Iterator;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 16:02
 * @Description Model 被观察者1
 */
public class Model implements Subject {
	private final int MIN_SPEED = 0;
	private final int MAX_SPEED = 20;
	private int speed;
	private List<ViewComponent> viewComponentList;

	public Model(int speed, List<ViewComponent> viewComponentList) {
		this.speed = speed;
		this.viewComponentList = viewComponentList;
	}

	public int add(int step) {
		speed += step;
		if (speed >= MAX_SPEED) {
			speed = MAX_SPEED;
		}
		return speed;
	}

	public int sub(int step) {
		speed -= step;
		if (speed <= MIN_SPEED) {
			speed = MIN_SPEED;
		}
		return speed;
	}

	public void registerObserver(ViewComponent observer) {
		viewComponentList.add(observer);
	}

	public void removeObserver(ViewComponent observer) {
		viewComponentList.remove(observer);
	}

	public void noticeObservers() {
		Iterator iterator = viewComponentList.iterator();
		while(iterator.hasNext()) {
			ViewComponent viewComponent = (ViewComponent) iterator.next();
			viewComponent.update(viewComponent);
		}
	}
}
