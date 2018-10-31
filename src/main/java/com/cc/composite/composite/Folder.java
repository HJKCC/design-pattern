package com.cc.composite.composite;

import com.cc.composite.component.SystemComponent;
import com.cc.composite.leaf.File;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 16:48
 * @Description Folder 组合
 */
public class Folder extends SystemComponent {
	private String name;
	private String description;
	private List element;

	public Folder(String name, String description) {
		this.name = name;
		this.description = description;
		this.element = new ArrayList<SystemComponent>();
	}

	public Folder(String name, String description, List element) {
		this.name = name;
		this.description = description;
		this.element = element;
	}

	public void addComponent(SystemComponent systemComponent) {
		element.add(systemComponent);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void print(String tab) {
		System.out.println(tab + "Folder: name='" + name + "\', description='" + description + "\', element size =" + element.size());
		Iterator iterator = element.iterator();
		while (iterator.hasNext()) {
			SystemComponent systemComponent = (SystemComponent) iterator.next();
			systemComponent.print("    " + tab);
		}

	}
}
