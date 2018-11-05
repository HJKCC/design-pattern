package com.cc.proxy.virtualProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/5 19:29
 * @Description ProxySubject 代理
 */
public class ProxySubject implements SubjectInterface {
	private RealSubject realSubject;

	public void print() {
		if (realSubject != null) {
			realSubject.print();
		} else {
			System.out.println("ProxySubject: Creating the Object of RealSubject ...");
			Thread proxyThread = new Thread(new Runnable() {
				public void run() {
					realSubject = new RealSubject("RealSubject");
					realSubject.print();
				}
			});
			proxyThread.start();
		}
	}
}
