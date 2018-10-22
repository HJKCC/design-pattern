package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:36
 * @Description DarkRoast
 */
public class Decaf extends Beverage {
	public Decaf() {
		super();
		super.setDescription("Decaf");
	}

	@Override
	public double cost() {
		return 0.53;
	}
}
