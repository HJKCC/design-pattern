package com.cc.simpleFactory.product.concrete;

import com.cc.simpleFactory.product.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 18:38
 * @Description ChicagoStylePepperoniPizza
 */
public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		super();
		setType("CheesePizza");
	}
}
