package com.cc.template;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 19:25
 * @Description ConcreteClass2
 */
public class ConcreteClass2 extends AbstractClass {
	public ConcreteClass2(boolean hookFlag) {
		super(hookFlag);
	}

	public void step1() {
		System.out.println("step1....special two");
	}

	public void step2() {
		System.out.println("step2....special two");
	}
}
