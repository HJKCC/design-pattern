package com.cc.abstractFactory.creator.concrete;

import com.cc.abstractFactory.creator.PizzaIngredientFactory;
import com.cc.abstractFactory.product.Cheese;
import com.cc.abstractFactory.product.Clams;
import com.cc.abstractFactory.product.Dough;
import com.cc.abstractFactory.product.Sauce;
import com.cc.abstractFactory.product.concrete.FrozenClams;
import com.cc.abstractFactory.product.concrete.PlumTomatoSauce;
import com.cc.abstractFactory.product.concrete.ReggianoCheese;
import com.cc.abstractFactory.product.concrete.ThickCrustDough;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 11:03
 * @Description NYPizzaIngredientFactory
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		System.out.println("create ThickCrustDough");
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		System.out.println("create PlumTomatoSauce");
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		System.out.println("create ReggianoCheese");
		return new ReggianoCheese();
	}

	public Clams createClams() {
		System.out.println("create FrozenClams");
		return new FrozenClams();
	}
}
