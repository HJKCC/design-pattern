package com.cc.proxy.dynamicProxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/6 17:04
 * @Description ProxySubject
 */
public class ProxySubject implements SubjectInterface {
	RealSubject realSubject;

	public ProxySubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	public String getName() {
		return realSubject.getName();
	}

	public void setName(String newName) {
		realSubject.setName(newName);
	}

	public String getDescription() {
		return realSubject.getDescription();
	}

	public void setDescription(String newDescription) {
		realSubject.setDescription(newDescription);
	}
}
