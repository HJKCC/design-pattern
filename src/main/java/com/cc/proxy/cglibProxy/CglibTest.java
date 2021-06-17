package com.cc.proxy.cglibProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2021/6/17 16:19
 * @Description CglibTest
 */
public class CglibTest {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject("test", "test");
		System.out.println(realSubject.getClass());

		RealSubject proxyObject = (RealSubject) new ProxyHandler(realSubject).getProxy();
		System.out.println(proxyObject.getClass());

		proxyObject.getDescription();
	}
}
