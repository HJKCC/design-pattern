package com.cc.proxy.cglibProxy;

import com.cc.proxy.dynamicProxy.GetterInvocationHandler;
import com.cc.proxy.dynamicProxy.SubjectInterface;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chencheng0816@gmail.com
 * @date 2021/6/17 16:09
 * @Description ProxyHandler
 */
public class ProxyHandler implements MethodInterceptor {
	private Object target;

	public ProxyHandler(Object target) {
		this.target = target;
	}

	/**
	 * 获取target的代理对象
	 * @return
	 */
	public Object getProxy() {
		//工具类
		Enhancer en = new Enhancer();
		//设置父类
		en.setSuperclass(target.getClass());
		//设置回调函数
		en.setCallback(this);
		//创建子类对象代理
		return en.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("代理方法开始执行...");
		Object res = method.invoke(target, args);
		System.out.println("代理方法执行结束...");

		return res;
	}
}
