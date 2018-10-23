package com.cc.simpleFactory.creator;

import com.cc.simpleFactory.product.Pizza;
import com.cc.simpleFactory.product.concrete.CheesePizza;
import com.cc.simpleFactory.product.concrete.ClamPizza;
import com.cc.simpleFactory.product.concrete.PepperoniPizza;
import com.cc.simpleFactory.product.concrete.VeggiePizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 20:21
 * @Description SimpleFactory
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("CheesePizza")) {
			pizza = new CheesePizza();
		} else if (type.equals("ClamPizza")) {
			pizza = new ClamPizza();
		} else if (type.equals("PepperoniPizza")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("VeggiePizza")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
