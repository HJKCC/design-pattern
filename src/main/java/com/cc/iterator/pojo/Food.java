package com.cc.iterator.pojo;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:36
 * @Description Food
 */
public class Food {
	private String name;
	private Double price;
	private boolean vegetarian;

	public Food(String name, Double price, boolean vegetarian) {
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public String toString() {
		return "name='" + name + '\'' +
				", price=" + price +
				", vegetarian=" + vegetarian;
	}
}
