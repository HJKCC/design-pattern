package com.cc.proxy.virtualProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/4 21:43
 * @Description VirtualTest
 */
public class VirtualTest {
	public static void main(String[] args) {
		SubjectInterface subjectInterface = new ProxySubject();
		subjectInterface.print();
		System.out.println("The main method is over!");
	}
}
