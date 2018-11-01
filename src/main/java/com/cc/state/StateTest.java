package com.cc.state;

import com.cc.state.context.Context;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/31 15:20
 * @Description 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 * 【状态集合类Context、State接口、具体状态ConcreteState】
 */
public class StateTest {
	public static void main(String[] args) {
		Context context = new Context();

		context.stepTwo();
		System.out.println("---------------------------");

		context.stepThree();
		System.out.println("---------------------------");

		context.stepOne();
		context.stepTwo();
		context.stepThree();
	}
}
