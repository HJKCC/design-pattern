package com.cc.mvc.view;

import com.cc.mvc.controller.ControllerInterface;

import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:17
 * @Description ViewComponent 组件抽象类
 */
public abstract class ViewComponent extends Observer {
	private ControllerInterface controllerInterface;

	public ViewComponent() {
	}

	public ViewComponent(ControllerInterface controllerInterface) {
		this.controllerInterface = controllerInterface;
	}

	public ControllerInterface getControllerInterface() {
		return controllerInterface;
	}

	public void setControllerInterface(ControllerInterface controllerInterface) {
		this.controllerInterface = controllerInterface;
	}

	public abstract String getName();

	public abstract void setName(String name);

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public void setDescription(String description) {
		throw new UnsupportedOperationException();
	}

	public void click() {
		throw new UnsupportedOperationException();
	}

	public void addElement(ViewButton viewButton) {
		throw new UnsupportedOperationException();
	}

	public List getElement() {
		throw new UnsupportedOperationException();
	}

	public void setElement(List element) {
		throw new UnsupportedOperationException();
	}
}
