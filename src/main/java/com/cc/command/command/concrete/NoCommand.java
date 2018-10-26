package com.cc.command.command.concrete;

import com.cc.command.command.Command;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 14:14
 * @Description NoCommand
 */
public class NoCommand implements Command {
	public void execute() {
		System.out.println("no command");
	}

	public void undo() {
		System.out.println("no command");
	}
}
