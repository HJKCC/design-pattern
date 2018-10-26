package com.cc.command.command.concrete;

import com.cc.command.command.Command;
import com.cc.command.recerver.Recerver2;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 11:00
 * @Description OffCommand2
 */
public class OffCommand2 implements Command {
	private Recerver2 recerver;

	public OffCommand2(Recerver2 recerver) {
		this.recerver = recerver;
	}

	public void execute() {
		if (recerver.isOn()) {
			recerver.off2();
		}
	}

	public void undo() {
		if (!recerver.isOn()) {
			recerver.on2();
		}
	}
}
