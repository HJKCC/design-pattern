package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;
import com.cc.decorator.service.CondimentDscorator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:59
 * @Description Mocha 摩卡
 */
public class Mocha extends CondimentDscorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.3;
	}
}
