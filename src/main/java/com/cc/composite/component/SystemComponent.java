package com.cc.composite.component;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 16:48
 * @Description SystemComponent 组件
 */
public abstract class SystemComponent {
	public abstract String getName();

	public String getSize() {
		throw new UnsupportedOperationException();
	}

	public void addFile() {
		throw new UnsupportedOperationException();
	}

	public abstract String getDescription();

	public abstract void print(String tab);
}
