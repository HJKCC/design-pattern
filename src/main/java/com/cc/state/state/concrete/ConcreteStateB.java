package com.cc.state.state.concrete;

import com.cc.state.context.Context;
import com.cc.state.state.State;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/31 15:24
 * @Description ConcreteStateB 具体状态B
 */
public class ConcreteStateB implements State {
	Context context;

	public ConcreteStateB(Context context) {
		this.context = context;
	}

	public void stepOne() {
		System.out.println("The method of stepOne cannot be performed in ConcreteStateB!");
	}

	public void stepTwo() {
		context.setState(context.getConcreteStateC());
		System.out.println("stepTwo: ConcreteStateB --> ConcreteStateC");
	}

	public void stepThree() {
		System.out.println("The method of stepThree cannot be performed in ConcreteStateB!");
	}
}
