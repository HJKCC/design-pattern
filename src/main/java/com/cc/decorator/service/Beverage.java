package com.cc.decorator.service;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:15
 * @Description Beverage 饮料抽象类
 */
public abstract class Beverage {
	private String description = "Unkown Beverage";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();
}
