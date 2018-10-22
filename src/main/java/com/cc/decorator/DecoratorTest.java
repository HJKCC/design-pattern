package com.cc.decorador;

import com.cc.decorador.service.Beverage;
import com.cc.decorador.service.impl.*;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/22 20:16
 * @Description 装饰者模式：动态地将责任附加到对象上。想要拓展功能，装饰者提供有别于继承的另一种选择。
 */
public class DecoratorTest {
	public static void main(String[] args) {

		Beverage customerA = new DarkRoast();
		customerA = new Milk(customerA);
		customerA = new Whip(customerA);
		System.out.println("customerA's coffee: " + customerA.getDescription());
		System.out.println("customerA's cost: " + customerA.cost() + "$");

		Beverage customerB = new Decaf();
		customerB = new Soy(customerB);
		customerB = new Mocha(customerB);
		customerB = new Whip(customerB);
		System.out.println("customerB's coffee: " + customerB.getDescription());
		System.out.println("customerB's cost: " + customerB.cost() + "$");
	}
}
