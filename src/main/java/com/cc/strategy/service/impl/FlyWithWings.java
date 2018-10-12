package com.cc.strategy.service.impl;

import com.cc.strategy.service.FlyBehavior;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 11:35
 * @Description FlyWithWings
 */
public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("Duck 可以通过翅膀飞翔");
	}
}
