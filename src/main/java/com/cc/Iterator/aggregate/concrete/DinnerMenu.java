package com.cc.Iterator.aggregate.concrete;

import com.cc.Iterator.aggregate.MenuInterface;
import com.cc.Iterator.pojo.Food;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:32
 * @Description DinnerMenu
 */
public class DinnerMenu implements MenuInterface {
	private Map foods;

	public DinnerMenu() {
		this.foods = new HashMap<String, Food>();
	}

	public DinnerMenu(Map foods) {
		this.foods = foods;
	}

	public void setFoods(Map foods) {
		this.foods = foods;
	}

	public void addFood(Food food) {
		foods.put(food.getName(), food);
	}

	public Iterator createIterator() {
		return foods.values().iterator();
	}
}
