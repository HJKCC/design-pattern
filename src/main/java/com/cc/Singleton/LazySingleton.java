package com.cc.Singleton;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 20:07
 * @Description 懒汉式（非线程安全）：多线程时可能生成多个对象
 */
public class LazySingleton {
	private static LazySingleton singleton;
	private LazySingleton() {

	}
	public static LazySingleton getInstence() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
