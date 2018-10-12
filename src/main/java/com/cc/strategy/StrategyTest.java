package com.cc.strategy;

import com.cc.strategy.pojo.Duck;
import com.cc.strategy.service.FlyBehavior;
import com.cc.strategy.service.impl.FlyNoWay;
import com.cc.strategy.service.impl.FlyWithWings;
import com.cc.strategy.service.QuackBehavior;
import com.cc.strategy.service.impl.Quack;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 11:50
 * @Description 策略模式定义了一系列算法族(如FlyBehavior、QuackBehavior)，分别将其封装起来，
 * 让它们之间可以相互替换。让算法的变化独立于使用算法的客户。
 */
public class StrategyTest {
	public static void main(String[] args) {
		String colour = "red";
		FlyBehavior flyBehavior = new FlyNoWay();
		QuackBehavior quackBehavior = new Quack();

		Duck duck = new Duck(colour, flyBehavior, quackBehavior );
		duck.display();
		duck.fly();
		duck.quack();

		System.out.println("-------------------------------------");
		duck.setFlyBehavior(new FlyWithWings());
		duck.fly();
	}
}
