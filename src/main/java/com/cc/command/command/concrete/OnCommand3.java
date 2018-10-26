package com.cc.command.command.concrete;

import com.cc.command.command.Command;
import com.cc.command.recerver.Recerver3;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/26 11:00
 * @Description OnCommand3
 */
public class OnCommand3 implements Command {
	private Recerver3 recerver;

	public OnCommand3(Recerver3 recerver) {
		this.recerver = recerver;
	}

	public void execute() {
		if (!recerver.isOn()) {
			recerver.on3();
		}
	}

	public void undo() {
		if (recerver.isOn()) {
			recerver.off3();
		}
	}
}
