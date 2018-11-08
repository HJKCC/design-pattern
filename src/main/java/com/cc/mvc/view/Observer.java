package com.cc.mvc.view;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 16:08
 * @Description Observer 观察者接口类
 */
public abstract class Observer {
	/**
	 * 收到通知后更新信息
	 */
	public void update(ViewComponent viewComponent, int speed) {};
}
