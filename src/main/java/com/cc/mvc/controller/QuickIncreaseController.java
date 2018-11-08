package com.cc.mvc.controller;

import com.cc.mvc.model.Subject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:16
 * @Description QuickIncreaseController 飞快增速
 */
public class QuickIncreaseController implements ControllerInterface {
	private Subject subject;

	public QuickIncreaseController(Subject subject) {
		this.subject = subject;
	}

	public void count() {
		subject.add(2);
	}
}
