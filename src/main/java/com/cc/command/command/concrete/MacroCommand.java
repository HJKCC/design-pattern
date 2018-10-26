package com.cc.command.command.concrete;

import com.cc.command.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 11:48
 * @Description MacroCommand
 */
public class MacroCommand implements Command {
	private List<Command> commandList;

	public MacroCommand() {
		this.commandList = new ArrayList<Command>();
	}

	public MacroCommand(List<Command> commandList) {
		this.commandList = commandList;
	}


	public void execute() {
		for (Command command : this.commandList) {
			command.execute();
		}
	}

	public void undo() {
		for (Command command : this.commandList) {
			command.undo();
		}
	}
}
