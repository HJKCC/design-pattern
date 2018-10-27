package com.cc.adapter.adapter;

import com.cc.adapter.adaptee.Adaptee;
import com.cc.adapter.target.Target;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 12:56
 * @Description Adapter 适配器
 */
public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void run() {
		adaptee.swim();
	}
}
