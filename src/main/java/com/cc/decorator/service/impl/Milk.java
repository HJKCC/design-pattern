package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;
import com.cc.decorator.service.CondimentDscorator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:59
 * @Description Milk
 */
public class Milk extends CondimentDscorator {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.1;
	}
}
