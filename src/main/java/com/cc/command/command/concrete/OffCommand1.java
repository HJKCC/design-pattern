package com.cc.command.command.concrete;

import com.cc.command.command.Command;
import com.cc.command.recerver.Recerver1;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 11:00
 * @Description OffCommand1
 */
public class OffCommand1 implements Command {
	private Recerver1 recerver;

	public OffCommand1(Recerver1 recerver) {
		this.recerver = recerver;
	}

	public void execute() {
		if (recerver.isOn()) {
			recerver.off1();
		}
	}

	public void undo() {
		if (!recerver.isOn()) {
			recerver.on1();
		}
	}
}
