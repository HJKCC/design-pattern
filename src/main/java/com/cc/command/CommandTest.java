package com.cc.command;

import com.cc.command.command.Command;
import com.cc.command.command.concrete.MacroCommand;
import com.cc.command.command.concrete.OnCommand1;
import com.cc.command.command.concrete.OnCommand2;
import com.cc.command.command.concrete.OnCommand3;
import com.cc.command.invoker.Invoker;
import com.cc.command.recerver.Recerver1;
import com.cc.command.recerver.Recerver2;
import com.cc.command.recerver.Recerver3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 10:58
 * @Description 命令模式：将一个命令封装成一个对象，从而可以根据不同的请求（如队列、日志请求）对调用者进行参数化，也可实现误操作撤销和宕机恢复功能。
 * 包含以下三个组成部分：invoker、command 和concrete command、recerver
 */
public class CommandTest {
	public static void main(String[] args) {
		Recerver1 recerver1 = new Recerver1("recerver1");
		Recerver2 recerver2 = new Recerver2("recerver2");
		Recerver3 recerver3 = new Recerver3("recerver3");

		OnCommand1 onCommand1 = new OnCommand1(recerver1);
		OnCommand2 onCommand2 = new OnCommand2(recerver2);
		OnCommand3 onCommand3 = new OnCommand3(recerver3);

		System.out.println("start Test1...........");
		Invoker invoker = new Invoker();
		invoker.execute();

		System.out.println("\nstart Test2...........");
		invoker = new Invoker(onCommand1);
		invoker.execute();
		invoker.undo();

		System.out.println("\nstart Test3...........");
		List<Command> commands = new ArrayList<Command>();
		commands.add(onCommand1);
		commands.add(onCommand2);
		commands.add(onCommand3);
		MacroCommand macroCommand = new MacroCommand(commands);
		invoker = new Invoker(macroCommand);
		invoker.execute();
		invoker.undo();
	}
}
