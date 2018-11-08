package com.cc.mvc.view;

import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:21
 * @Description ViewComposite 组合
 */
public class ViewComposite extends ViewComponent {
	private String name;
	private List element;

	public ViewComposite(String name, List element) {
		super();
		this.name = name;
		this.element = element;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addElement(ViewComponent viewLeaf) {
		element.add(viewLeaf);
	}

	public List getElement() {
		return element;
	}

	public void setElement(List element) {
		this.element = element;
	}

	public void update(ViewComponent viewComponent, int speed) {
		System.out.println(viewComponent.getName() + " is noticed: (" + viewComponent.getName() + ", " + speed + ")");
	}
}
