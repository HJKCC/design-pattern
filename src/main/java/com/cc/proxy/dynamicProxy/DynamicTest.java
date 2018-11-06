package com.cc.proxy.dynamicProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/5 20:11
 * @Description DynamicTest 动态代理
 */
public class DynamicTest {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject("test", "test");
		SubjectInterface proxySubject = GetterInvocationHandler.getProxy(realSubject);
		System.out.println("getDescription() --- " + proxySubject.getDescription());
		proxySubject.setDescription("test set");
	}
}
