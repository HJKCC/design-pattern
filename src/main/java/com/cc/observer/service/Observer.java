package com.cc.observer.service;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:05
 * @Description Observer 观察者接口类
 */
public interface Observer {
	/**
	 * 收到通知后更新信息
	 */
	public void update();
}
