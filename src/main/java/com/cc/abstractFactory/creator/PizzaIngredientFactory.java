package com.cc.abstractFactory.creator;

import com.cc.abstractFactory.product.Cheese;
import com.cc.abstractFactory.product.Clams;
import com.cc.abstractFactory.product.Dough;
import com.cc.abstractFactory.product.Sauce;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 11:01
 * @Description PizzaIngredientFactory 抽象工厂中，所有具体工厂都必须实现此接口，此接口包含一组方法来生产各种家族产品
 */
public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Clams createClams();
}
