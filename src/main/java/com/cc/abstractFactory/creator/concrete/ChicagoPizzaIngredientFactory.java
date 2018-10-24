package com.cc.abstractFactory.creator.concrete;

import com.cc.abstractFactory.creator.PizzaIngredientFactory;
import com.cc.abstractFactory.product.Cheese;
import com.cc.abstractFactory.product.Clams;
import com.cc.abstractFactory.product.Dough;
import com.cc.abstractFactory.product.Sauce;
import com.cc.abstractFactory.product.concrete.FreshClams;
import com.cc.abstractFactory.product.concrete.MarinaraSauce;
import com.cc.abstractFactory.product.concrete.ReggianoCheese;
import com.cc.abstractFactory.product.concrete.ThinCrustDough;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 11:05
 * @Description ChicagoPizzaIngredientFactory
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		System.out.println("create ThinCrustDough");
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		System.out.println("create MarinaraSauce");
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		System.out.println("create ReggianoCheese");
		return new ReggianoCheese();
	}

	public Clams createClams() {
		System.out.println("create FreshClams");
		return new FreshClams();
	}
}
