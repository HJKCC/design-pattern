package com.cc.simpleFactory;

import com.cc.simpleFactory.creator.SimplePizzaFactory;
import com.cc.simpleFactory.product.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 18:39
 * @Description FactoryTest
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		Pizza pizza = simplePizzaFactory.createPizza("CheesePizza");

		pizza.bake();
		pizza.cut();
		pizza.box();

		System.out.println(pizza.getType() + "is over!");
	}
}
