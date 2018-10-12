package com.cc.observer.service;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:02
 * @Description Subject 主体接口类
 */
public interface Subject {
	/**
	 * 新增观察者
	 */
	public void registerObserver(Observer observer);

	/**
	 * 移除观察者
	 */
	public void removeObserver(Observer observer);

	/**
	 * 当主体状态改变时，通知观察者
	 */
	public void noticeObservers();
}
