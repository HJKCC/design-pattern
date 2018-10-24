package com.cc.abstractFactory;

import com.cc.abstractFactory.creator.PizzaIngredientFactory;
import com.cc.abstractFactory.creator.concrete.NYPizzaIngredientFactory;
import com.cc.abstractFactory.product.concrete.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 18:39
 * @Description FactoryTest
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		//以下业务也可依据工厂方法模式设计。
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		Pizza pizza = new Pizza(pizzaIngredientFactory);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println("pizza is over");
	}

}
