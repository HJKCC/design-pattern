package com.cc.mvc.model;

import com.cc.mvc.view.ViewComponent;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 15:59
 * @Description Subject 主体接口类
 */
public interface Subject {
	public void add(int step);
	public void sub(int step);
	/**
	 * 新增观察者
	 */
	public void registerObserver(ViewComponent observer);

	/**
	 * 移除观察者
	 */
	public void removeObserver(ViewComponent observer);

	/**
	 * 当主体状态改变时，通知观察者
	 */
	public void noticeObservers();
}
