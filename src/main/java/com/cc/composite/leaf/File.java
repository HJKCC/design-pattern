package com.cc.composite.leaf;

import com.cc.composite.component.SystemComponent;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 16:49
 * @Description File 叶节点
 */
public class File extends SystemComponent {
	private String name;
	private String size;
	private String description;

	public File(String name, String size, String description) {
		this.name = name;
		this.size = size;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSize() {
		return size;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void print(String tab) {
		System.out.println(tab + "File: name='" + name + "\', size='" + size + "\', description='" + description + "\'");
	}
}
