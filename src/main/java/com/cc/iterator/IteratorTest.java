package com.cc.iterator;

import com.cc.iterator.aggregate.MenuInterface;
import com.cc.iterator.aggregate.concrete.BreakfastMenu;
import com.cc.iterator.aggregate.concrete.DinnerMenu;
import com.cc.iterator.aggregate.concrete.LunchMenu;
import com.cc.iterator.pojo.Food;
import com.cc.iterator.pojo.Waiter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/28 15:16
 * @Description IteratorTest
 */
public class IteratorTest {
	public static void main(String[] args) {
		BreakfastMenu breakfastMenu = new BreakfastMenu();
		LunchMenu lunchMenu = new LunchMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();

		breakfastMenu.addFood(new Food("egg", 0.4, false));
		breakfastMenu.addFood(new Food("corn", 0.2, true));

		lunchMenu.addFood(new Food("nbs", 12.0, false));
		lunchMenu.addFood(new Food("beef", 15.0, false));

		dinnerMenu.addFood(new Food("noodles", 5.0, true));
		dinnerMenu.addFood(new Food("kfc", 8.5, false));

		List menus = new ArrayList<MenuInterface>();
		menus.add(breakfastMenu);
		menus.add(lunchMenu);
		menus.add(dinnerMenu);
		Waiter waiter = new Waiter(menus);
		waiter.printMenu();
	}

}
