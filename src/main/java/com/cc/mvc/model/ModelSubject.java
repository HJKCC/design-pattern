package com.cc.mvc.model;

import com.cc.mvc.view.ViewComponent;

import java.util.Iterator;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 16:02
 * @Description ModelSubject 被观察者
 */
public class ModelSubject implements Subject {
	private final int MIN_SPEED = 0;
	private final int MAX_SPEED = 20;
	private int speed;
	private List<ViewComponent> viewComponentList;

	public ModelSubject(int speed, List<ViewComponent> viewComponentList) {
		this.speed = speed;
		this.viewComponentList = viewComponentList;
	}

	public void add(int step) {
		speed += step;
		if (speed >= MAX_SPEED) {
			speed = MAX_SPEED;
		}
		noticeObservers();
	}

	public void sub(int step) {
		speed -= step;
		if (speed <= MIN_SPEED) {
			speed = MIN_SPEED;
		}
		noticeObservers();
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
			viewComponent.update(viewComponent, speed);
		}
	}
}
