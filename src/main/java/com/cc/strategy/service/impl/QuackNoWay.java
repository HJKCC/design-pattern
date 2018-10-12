package com.cc.strategy.service.impl;

import com.cc.strategy.service.QuackBehavior;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 11:33
 * @Description QuackNoWay
 */
public class QuackNoWay implements QuackBehavior {
	public void quack() {
		System.out.println("Duck 不能发声");
	}
}
