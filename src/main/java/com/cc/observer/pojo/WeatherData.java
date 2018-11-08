package com.cc.observer.pojo;

import com.cc.observer.service.Observer;

import java.util.ArrayList;
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

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void updateMeasurements(float temperature, float humidity, float pressure) {
		if(this.temperature == temperature && this.humidity == humidity && this.pressure == pressure) {
			return;
		}
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		noticeObservers();
	}

	public void noticeObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
}
