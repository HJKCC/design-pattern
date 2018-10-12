package com.cc.strategy.service.impl;

import com.cc.observer.service.Observer;
import com.cc.observer.service.Subject;

import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:16
 * @Description WeatherData
 */
public class WeatherData implements Subject {
	/**
	 * 温度
	 */
	private float temperature;
	/**
	 * 湿度
	 */
	private float humidity;
	/**
	 * 压力
	 */
	private float pressure;
	/**
	 * 观察者
	 */
	private List<Observer> observers;

	public void registerObserver(Observer observer) {

	}

	public void removeObserver(Observer observer) {

	}

	public void noticeObservers() {

	}
}
