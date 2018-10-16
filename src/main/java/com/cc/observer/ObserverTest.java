package com.cc.observer;

import com.cc.observer.pojo.WeatherData;
import com.cc.observer.service.impl.CurrentDisplay;
import com.cc.observer.service.impl.ForecastDisplay;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:15
 * @Description 在对象之间定义一对多的依赖，当一个对象改变状态，依赖它的对象都会收到通知，并自动完成更新操作
 */
public class ObserverTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.updateMeasurements(12, 25, 78);
		weatherData.updateMeasurements(21, 34, 85);
		weatherData.updateMeasurements(21, 34, 85); //未变化
		weatherData.updateMeasurements(19, 37, 90);
	}
}
