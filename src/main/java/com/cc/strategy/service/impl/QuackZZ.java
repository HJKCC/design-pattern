package com.cc.strategy.service.impl;

import com.cc.strategy.service.QuackBehavior;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 11:31
 * @Description QuackZZ
 */
public class QuackZZ implements QuackBehavior {
	public void quack() {
		System.out.println("Duck 可以吱吱叫");
	}
}
