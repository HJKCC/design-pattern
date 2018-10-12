package com.cc.observer.service.impl;

import com.cc.observer.service.DisplayDevice;
import com.cc.observer.service.Observer;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/12 17:13
 * @Description ThirdPartyDisplay 显示气候分析结果
 */
public class ThirdPartyDisplay implements Observer, DisplayDevice {
	public void update(float temperature, float humidity, float pressure) {
		//统计分析气候情况
	}

	public void display() {
		//显示气候分析结果
	}
}
