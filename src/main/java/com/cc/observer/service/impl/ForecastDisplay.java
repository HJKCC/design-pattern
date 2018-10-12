package com.cc.observer.service.impl;

import com.cc.observer.service.DisplayDevice;
import com.cc.observer.service.Observer;
import com.cc.observer.service.Subject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:12
 * @Description ForecastDisplay 显示天气预报
 */
public class ForecastDisplay implements Observer, DisplayDevice {
	private float temperature;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature + (float) Math.random() * 10;
		display();
	}

	public void display() {
		System.out.println("Forecast temperature: " + temperature + "F degrees");
	}

}
