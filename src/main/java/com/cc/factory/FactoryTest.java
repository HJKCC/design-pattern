package com.cc.factory;

import com.cc.factory.creator.PizzaStore;
import com.cc.factory.creator.concrete.ChicagoPizzaStore;
import com.cc.factory.creator.concrete.NYPizzaStore;
import com.cc.factory.product.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 18:39
 * @Description FactoryTest
 */
public class FactoryTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("PepperoniPizza");
		System.out.println(pizza.getName());

		System.out.println("---------------------------------------------");

		pizzaStore = new ChicagoPizzaStore();
		pizza = pizzaStore.orderPizza("VeggiePizza");
		System.out.println(pizza.getName());
	}

}
