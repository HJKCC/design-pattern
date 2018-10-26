package com.cc.command.invoker;

import com.cc.command.command.Command;
import com.cc.command.command.concrete.NoCommand;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 11:02
 * @Description Invoker 调用者
 */
public class Invoker {
	private Command command;

	public Invoker() {
		command = new NoCommand();
	}

	public Invoker(Command command) {
		this.command = command;
	}

	public void execute() {
		command.execute();
	}

	public void undo() {
		command.undo();
	}
}
