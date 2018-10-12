package com.cc.strategy.pojo;

import com.cc.strategy.service.FlyBehavior;
import com.cc.strategy.service.QuackBehavior;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 11:40
 * @Description Duck
 */
public class Duck {
	/**
	 * 外观颜色
	 */
	private String colour;
	/**
	 * 飞翔方式
	 */
	private FlyBehavior flyBehavior;
	/**
	 * 鸣叫方式
	 */
	private QuackBehavior quackBehavior;

	public void display() {
		System.out.println(colour);
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void quack() {
		quackBehavior.quack();
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public Duck() {
	}

	public Duck(String colour, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.colour = colour;
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
}
