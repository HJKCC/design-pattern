package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;
import com.cc.decorator.service.CondimentDscorator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:59
 * @Description Whip 奶泡
 */
public class Whip extends CondimentDscorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.53;
	}
}
