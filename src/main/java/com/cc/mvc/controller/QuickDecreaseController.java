package com.cc.mvc.controller;

import com.cc.mvc.model.Subject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:16
 * @Description QuickIncreaseController 飞快减速
 */
public class QuickDecreaseController implements ControllerInterface {
	private Subject subject;

	public QuickDecreaseController(Subject subject) {
		this.subject = subject;
	}

	public void count() {
		subject.sub(2);
	}
}
