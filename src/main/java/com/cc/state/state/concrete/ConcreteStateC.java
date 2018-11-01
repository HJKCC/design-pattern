package com.cc.state.state.concrete;

import com.cc.state.context.Context;
import com.cc.state.state.State;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/31 15:24
 * @Description ConcreteStateC 具体状态C
 */
public class ConcreteStateC implements State {
	Context context;

	public ConcreteStateC(Context context) {
		this.context = context;
	}

	public void stepOne() {
		System.out.println("The method of stepOne cannot be performed in ConcreteStateC!");
	}

	public void stepTwo() {
		System.out.println("The method of stepTwo cannot be performed in ConcreteStateC!");
	}

	public void stepThree() {
		context.setState(context.getConcreteStateA());
		System.out.println("stepThree: ConcreteStateC --> ConcreteStateA");
	}
}
