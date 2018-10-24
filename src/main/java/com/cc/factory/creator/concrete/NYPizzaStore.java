package com.cc.factory.creator.concrete;

import com.cc.factory.creator.PizzaStore;
import com.cc.factory.product.concrete.NYStyleCheesePizza;
import com.cc.factory.product.concrete.NYStyleClamPizza;
import com.cc.factory.product.concrete.NYStylePepperoniPizza;
import com.cc.factory.product.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 20:21
 * @Description NYPizzaStore 纽约口味披萨店
 */
public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("CheesePizza")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("ClamPizza")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("PepperoniPizza")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("VeggiePizza")) {
			pizza = new NYStyleCheesePizza();
		}
		return pizza;
	}
}
