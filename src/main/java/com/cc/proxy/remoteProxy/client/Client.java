package com.cc.proxy.remoteProxy.client;

import com.cc.proxy.remoteProxy.server.RMIInterface;
import com.cc.proxy.remoteProxy.server.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:47
 * @Description Client 客户端程序（需导入油服务端相关远程接口和实体类生成的jar包，如RMIInterface、User），部署于客户机
 */
public class Client {
	public static void main(String[] args) {
		try {
			User user = new User("test", "test rmi");
			RMIInterface rmiInterface = (RMIInterface) Naming.lookup("rmi://127.0.0.1:3348/RMIInterface");
			String name = rmiInterface.helloRMI(user);
			System.out.println("user name is: " + name);
			rmiInterface.exit("RMIInterface");
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
