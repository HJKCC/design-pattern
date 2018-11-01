package com.cc.state.state.concrete;

import com.cc.state.context.Context;
import com.cc.state.state.State;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/31 15:24
 * @Description ConcreteStateA 具体状态A
 */
public class ConcreteStateA implements State {
	Context context;

	public ConcreteStateA(Context context) {
		this.context = context;
	}

	public void stepOne() {
		context.setState(context.getConcreteStateB());
		System.out.println("stepOne: ConcreteStateA --> ConcreteStateB");
	}

	public void stepTwo() {
		System.out.println("The method of stepTwo cannot be performed in ConcreteStateA!");
	}

	public void stepThree() {
		System.out.println("The method of stepThree cannot be performed in ConcreteStateA!");
	}
}
