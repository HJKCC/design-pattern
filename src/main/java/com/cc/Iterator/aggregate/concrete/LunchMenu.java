package com.cc.Iterator.aggregate.concrete;

import com.cc.Iterator.aggregate.MenuInterface;
import com.cc.Iterator.concreteIterator.ArrayIterator;
import com.cc.Iterator.pojo.Food;

import java.util.Iterator;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:32
 * @Description LunchMenu
 */
public class LunchMenu implements MenuInterface {
	private Food[] foods;
	private int position = 0;

	public LunchMenu() {
		this.foods = new Food[10];
	}

	public LunchMenu(Food[] foods) {
		this.foods = foods;
	}

	public void setFoods(Food[] foods) {
		this.foods = foods;
		this.position = foods.length;
	}

	public void addFood(Food food) {
		foods[position] = food;
		position++;
	}

	public Iterator createIterator() {
		return new ArrayIterator(foods);
	}
}
