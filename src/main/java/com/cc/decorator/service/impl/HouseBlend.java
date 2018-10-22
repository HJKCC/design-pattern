package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:36
 * @Description HouseBlend 脱咖啡因咖啡
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		super();
		super.setDescription("HouseBlend");
	}

	@Override
	public double cost() {
		return 1.01;
	}
}
