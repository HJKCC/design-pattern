package com.cc.state.context;

import com.cc.state.state.State;
import com.cc.state.state.concrete.ConcreteStateA;
import com.cc.state.state.concrete.ConcreteStateB;
import com.cc.state.state.concrete.ConcreteStateC;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/31 15:20
 * @Description Context 上下文，状态集合类
 */
public class Context {
	ConcreteStateA concreteStateA;
	ConcreteStateB concreteStateB;
	ConcreteStateC concreteStateC;
	State state;

	public Context() {
		this.concreteStateA = new ConcreteStateA(this);
		this.concreteStateB = new ConcreteStateB(this);
		this.concreteStateC = new ConcreteStateC(this);
		this.state = concreteStateA;
	}

	public void setState(State state) {
		this.state = state;
	}

	public ConcreteStateA getConcreteStateA() {
		return concreteStateA;
	}

	public ConcreteStateB getConcreteStateB() {
		return concreteStateB;
	}

	public ConcreteStateC getConcreteStateC() {
		return concreteStateC;
	}

	public void stepOne() {
		state.stepOne();
	}

	public void stepTwo() {
		state.stepTwo();
	}

	public void stepThree() {
		state.stepThree();
	}
}
