package com.cc.adapter;

import com.cc.adapter.adaptee.Adaptee;
import com.cc.adapter.adapter.Adapter;
import com.cc.adapter.target.Target;

import java.lang.reflect.Method;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 12:52
 * @Description 适配器模式：将一个类的接口转换为客户期望的另一个接口，解耦客户与被适配者。
 * 【客户目标接口Target、适配器Adapter、被适配者Adaptee】
 */
public class AdapterTest {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		System.out.print("Adaptee's methods: ");
		for (Method method : Adapter.class.getMethods()) {
			System.out.print(method.getName() + "  ");
		}
		System.out.println();

		//经过适配器转换之后，swim() ---> run()
		Target client = new Adapter(adaptee);
		client.run();
	}


}
