package com.cc.proxy.cglibProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2021/6/17 16:04
 * @Description RealSubject
 */
public class RealSubject {
	private String name;
	private String description;

	public RealSubject() {
	}

	public RealSubject(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName() --- name");
	}

	public String getDescription() {
		System.out.println(description);
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		System.out.println("setDescription() --- description");
	}
}
