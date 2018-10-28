package com.cc.template;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 19:20
 * @Description AbstractClass
 */
public abstract class AbstractClass {
	private boolean hookFlag;

	public AbstractClass(boolean hookFlag) {
		this.hookFlag = hookFlag;
	}

	/**
	 * 模板方法，为避免子类篡改模板算法，特声明为final
	 */
	public final void templateMethod() {
		start();
		step1();
		step2();
		if (hookFlag) {
			hook();
		}
		end();
	}

	/**
	 * 具体方法1
	 */
	public void start() {
		System.out.println("start templateMethod ...");
	}

	/**
	 * 抽象方法2
	 */
	public abstract void step1();

	/**
	 * 抽象方法3
	 */
	public abstract void step2();

	/**
	 * 具体方法4
	 */
	public void end() {
		System.out.println("end templateMethod ...");
	}

	/**
	 * 钩子，并非一定执行的步骤
	 */
	public void hook() {
		System.out.println("hook ...");
	}
}
