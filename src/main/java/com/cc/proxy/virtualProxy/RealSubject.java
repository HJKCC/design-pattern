package com.cc.proxy.virtualProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/5 19:29
 * @Description RealSubject 真实对象，，创建开销较大
 */
public class RealSubject implements SubjectInterface {
	private String name;

	public RealSubject(String name) {
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.name = name;
	}

	public void print() {
		System.out.println("The RealSubject is: " + name);
	}
}
