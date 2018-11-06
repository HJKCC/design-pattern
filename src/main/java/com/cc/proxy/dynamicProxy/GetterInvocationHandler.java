package com.cc.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/6 17:06
 * @Description GetterInvocationHandler Get代理处理类：只处理get请求
 */
public class GetterInvocationHandler implements InvocationHandler {
	SubjectInterface subjectInterface;

	public GetterInvocationHandler(SubjectInterface subjectInterface) {
		this.subjectInterface = subjectInterface;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("get")) {
			return method.invoke(subjectInterface, args);
		} else {
			throw new IllegalAccessException();
		}
	}

	/**
	 * 获取subjectInterface的代理对象
	 * @param realSubject
	 * @return
	 */
	public static SubjectInterface getProxy(SubjectInterface realSubject) {
		return (SubjectInterface) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				new GetterInvocationHandler(realSubject));
	}
}
