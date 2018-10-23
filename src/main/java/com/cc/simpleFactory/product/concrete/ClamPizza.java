package com.cc.simpleFactory.product.concrete;

import com.cc.simpleFactory.product.Pizza;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 18:38
 * @Description ClamPizza
 */
public class ClamPizza extends Pizza {
	public ClamPizza() {
		super();
		setType("CheesePizza");
	}
}
