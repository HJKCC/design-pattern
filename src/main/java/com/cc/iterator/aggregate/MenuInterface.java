package com.cc.iterator.aggregate;

import com.cc.iterator.pojo.Food;

import java.util.Iterator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:31
 * @Description MenuInterface
 */
public interface MenuInterface {
	public void addFood(Food food);
	public Iterator createIterator();
}
