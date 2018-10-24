package com.cc.factory.creator.concrete;

import com.cc.factory.creator.PizzaStore;
import com.cc.factory.product.Pizza;
import com.cc.factory.product.concrete.*;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 21:45
 * @Description ChicagoPizzaStore 芝加哥口味披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("CheesePizza")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("ClamPizza")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("PepperoniPizza")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("VeggiePizza")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		return pizza;
	}
}
