package com.cc.command.recerver;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 11:02
 * @Description Recerver3 接收者
 */
public class Recerver3 {
	private String name;
	private boolean status;

	public boolean isOn() {
		return status;
	}

	public Recerver3(String name) {
		this.name = name;
		this.status = false;
	}

	public void on3() {
		this.status = true;
		System.out.println(this.getClass().getName() + ": " + this.name + " is on1");
	}

	public void off3() {
		this.status = false;
		System.out.println(this.getClass().getName() + ": " + this.name + " is off1");
	}
}
