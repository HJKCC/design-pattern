package com.cc.proxy.dynamicProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/6 17:02
 * @Description RealSubject 真实对象
 */
public class RealSubject implements SubjectInterface {
	private String name;
	private String description;

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
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		System.out.println("setDescription() --- description");
	}
}
