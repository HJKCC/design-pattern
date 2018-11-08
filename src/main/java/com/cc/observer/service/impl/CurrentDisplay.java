package com.cc.observer.service.impl;

import com.cc.observer.service.DisplayDevice;
import com.cc.observer.service.Observer;
import com.cc.observer.pojo.Subject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:11
 * @Description CurrentDisplay 显示当前温度与湿度
 */
public class CurrentDisplay implements Observer, DisplayDevice {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditiongs: " + temperature + "F degrees and "
				+ humidity + "% humidity");
	}
}
