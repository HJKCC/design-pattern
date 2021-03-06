package com.cc.decorator.service.impl;

import com.cc.decorator.service.Beverage;
import com.cc.decorator.service.CondimentDscorator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:59
 * @Description Soy 豆子
 */
public class Soy extends CondimentDscorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.77;
	}
}
