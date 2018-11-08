package com.cc.mvc.view;

import com.cc.mvc.controller.ControllerInterface;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:22
 * @Description ViewLeaf
 */
public class ViewLeaf extends ViewComponent {
	private String name;
	private int value;
	private String description;

	public ViewLeaf(String name, String description, ControllerInterface controllerInterface) {
		super(controllerInterface);
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void update(ViewComponent viewComponent) {
		System.out.println("ViewLeaf is noticed: (" + viewComponent.getName() + ", " + viewComponent.getDescription() + ")");
	}
}
