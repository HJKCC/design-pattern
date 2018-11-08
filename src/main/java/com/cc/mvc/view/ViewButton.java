package com.cc.mvc.view;

import com.cc.mvc.controller.ControllerInterface;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:22
 * @Description ViewButton 叶节点
 */
public class ViewButton extends ViewComponent {
	private String name;
	private String description;

	public ViewButton(String name, String description, ControllerInterface controllerInterface) {
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

	public void click() {
		getControllerInterface().count();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
