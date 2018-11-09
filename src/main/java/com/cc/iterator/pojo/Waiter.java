package com.cc.iterator.pojo;

import com.cc.iterator.aggregate.MenuInterface;

import java.util.Iterator;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:42
 * @Description Waiter
 */
public class Waiter {
	private List menus;

	public Waiter(List menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator iterator = menus.iterator();
		while(iterator.hasNext()) {
			MenuInterface menu = (MenuInterface) iterator.next();
			printMenu(menu);
		}
	}

	private void printMenu(MenuInterface menu) {
		Iterator iterator = menu.createIterator();
		while (iterator.hasNext()) {
			Food food = (Food) iterator.next();
			System.out.println(food);
		}
	}
}
