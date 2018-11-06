package com.cc.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/6 17:07
 * @Description SetterInvocationHandler  Set代理处理类：只处理set请求
 */
public class SetterInvocationHandler implements InvocationHandler {
	SubjectInterface subjectInterface;

	public SetterInvocationHandler(SubjectInterface subjectInterface) {
		this.subjectInterface = subjectInterface;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("set")) {
			return method.invoke(subjectInterface, args);
		} else {
			throw new IllegalAccessException();
		}
	}

	public static SubjectInterface getProxy(SubjectInterface realSubject) {
		return (SubjectInterface) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				new SetterInvocationHandler(realSubject));
	}
}
