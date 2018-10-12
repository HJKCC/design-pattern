package com.cc.strategy.service.impl;

import com.cc.strategy.service.FlyBehavior;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 11:34
 * @Description FlyNoWay
 */
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("Duck 无法飞翔");
	}
}
