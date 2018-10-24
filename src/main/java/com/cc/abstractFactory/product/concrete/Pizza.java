package com.cc.abstractFactory.product.concrete;

import com.cc.abstractFactory.creator.PizzaIngredientFactory;
import com.cc.abstractFactory.product.Cheese;
import com.cc.abstractFactory.product.Clams;
import com.cc.abstractFactory.product.Dough;
import com.cc.abstractFactory.product.Sauce;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 18:37
 * @Description Pizza
 */
public class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Cheese cheese;
	private Clams clams;

	private PizzaIngredientFactory pizzaIngredientFactory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	public void prepare() {
		System.out.println("prepare pizza");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		clams = pizzaIngredientFactory.createClams();
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
}
