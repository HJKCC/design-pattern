package com.cc.template;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 19:25
 * @Description ConcreteClass1
 */
public class ConcreteClass1 extends AbstractClass {
	public ConcreteClass1(boolean hookFlag) {
		super(hookFlag);
	}

	public void step1() {
		System.out.println("step1....special one");
	}

	public void step2() {
		System.out.println("step2....special one");
	}
}
