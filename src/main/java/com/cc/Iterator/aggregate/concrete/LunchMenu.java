package com.cc.Iterator.aggregate.concrete;

import com.cc.Iterator.aggregate.MenuInterface;
import com.cc.Iterator.pojo.Food;

import java.util.Iterator;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:32
 * @Description BreakfastMenu
 */
public class BreakfastMenu implements MenuInterface {
	private List foods;

	public BreakfastMenu(List foods) {
		this.foods = foods;
	}

	public void addFood(Food food) {
		foods.add(food);
	}

	public Iterator createIterator() {
		return foods.iterator();
	}
}
