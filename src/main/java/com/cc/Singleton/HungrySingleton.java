package com.cc.Singleton;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 20:07
 * @Description 饿汉式：如果对象未被使用，浪费资源
 */
public class HungrySingleton {
	private static HungrySingleton singleton = new HungrySingleton();
	private HungrySingleton() {

	}
	public static HungrySingleton getInstence() {
		if (singleton == null) {
			singleton = new HungrySingleton();
		}
		return singleton;
	}
}
