package com.cc.decorador.service.impl;

import com.cc.decorador.service.Beverage;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:36
 * @Description DarkRoast
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
