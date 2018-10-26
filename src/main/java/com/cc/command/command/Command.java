package com.cc.command.command;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 10:58
 * @Description Command
 */
public interface Command {
	public void execute();
	public void undo();
}
