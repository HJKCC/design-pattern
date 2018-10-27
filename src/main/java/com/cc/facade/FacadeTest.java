package com.cc.facade;

import com.cc.facade.device.Device1;
import com.cc.facade.device.Device2;
import com.cc.facade.device.Device3;
import com.cc.facade.facade.Facade;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 14:22
 * @Description 外观模式：即门面模式，提供一个统一的接口来处理子系统中的一群接口。如MVC 中的service层
 */
public class FacadeTest {
	public static void main(String[] args) {
		Device1 device1 = new Device1();
		Device2 device2 = new Device2();
		Device3 device3 = new Device3();
		Facade facade = new Facade(device1, device2, device3);

		facade.on();
		facade.off();
	}
}
