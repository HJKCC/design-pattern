package com.cc.mvc.controller;

import com.cc.mvc.model.Subject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/8 10:16
 * @Description SlowIncreaseController 缓慢减速
 */
public class SlowDecreaseController implements ControllerInterface {
	private Subject subject;

	public SlowDecreaseController(Subject subject) {
		this.subject = subject;
	}

	public void count() {
		subject.sub(1);
	}
}
