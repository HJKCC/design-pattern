package com.cc.facade.facade;

import com.cc.facade.device.Device1;
import com.cc.facade.device.Device2;
import com.cc.facade.device.Device3;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 14:22
 * @Description Facade
 */
public class Facade {
	private Device1 device1;
	private Device2 device2;
	private Device3 device3;

	public Facade(Device1 device1, Device2 device2, Device3 device3) {
		this.device1 = device1;
		this.device2 = device2;
		this.device3 = device3;
	}

	public void on() {
		device1.on();
		device2.on();
		device3.on();
	}

	public void off() {
		device1.off();
		device2.off();
		device3.off();
	}
}
