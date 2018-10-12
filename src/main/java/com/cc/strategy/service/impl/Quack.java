package com.cc.strategy.service.impl;

import com.cc.strategy.service.QuackBehavior;

/**
 * @author chencheng0816@gmail.com
 * @Description Quack
 * @date 2018/10/12 11:08
 */
public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Duck 可以呱呱叫");
	}
}
