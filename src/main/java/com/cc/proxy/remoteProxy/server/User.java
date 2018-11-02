package com.cc.proxy.remoteProxy.server;

import java.io.Serializable;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 14:00
 * @Description User 实体类。为方便网络传输，需拓展Serializable接口
 */
public class User implements Serializable {
	private String name;
	private String description;

	public User(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
