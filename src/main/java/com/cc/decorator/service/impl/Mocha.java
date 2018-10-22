package com.cc.decorador.service.impl;

import com.cc.decorador.service.Beverage;
import com.cc.decorador.service.CondimentDscorator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:59
 * @Description Milk
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
