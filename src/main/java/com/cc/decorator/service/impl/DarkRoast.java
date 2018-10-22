package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:36
 * @Description DarkRoast 深焙咖啡
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		super();
		super.setDescription("DarkRoast");
	}

	@Override
	public double cost() {
		return 1.33;
	}
}
