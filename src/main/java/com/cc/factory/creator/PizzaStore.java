package com.cc.factory.creator;

import com.cc.factory.product.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 20:22
 * @Description PizzaStore
 */
public abstract class PizzaStore {
	public abstract Pizza createPizza(String type);

	/**
	 * 预定披萨
	 * @param type 披萨类型
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
