package com.cc.singleton;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/24 20:07
 * @Description 懒汉式（线程安全）：双重检查加锁volatile、synchronized
 */
public class SynLazySingleton {
	private volatile static SynLazySingleton singleton;
	private SynLazySingleton() {

	}
	public static SynLazySingleton getInstence() {
		if (singleton == null) {
			synchronized (SynLazySingleton.class) {
				singleton = new SynLazySingleton();
			}
		}
		return singleton;
	}
}
