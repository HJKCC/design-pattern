package com.cc.simpleFactory.product;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/23 18:37
 * @Description Pizza
 */
public abstract class Pizza {
	private String type = "Pizza";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
