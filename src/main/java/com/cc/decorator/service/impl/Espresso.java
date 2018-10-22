package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:36
 * @Description Espresso 意大利浓咖啡
 */
public class Espresso extends Beverage {
	public Espresso() {
		super();
		super.setDescription("Espresso");
	}

	@Override
	public double cost() {
		return 0.99;
	}
}
