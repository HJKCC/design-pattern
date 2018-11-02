package com.cc.proxy.remoteProxy.server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:19
 * @Description RMIInterfaceImpl 远程接口实现类
 * 为了实现远程服务对象的功能，继承UnicastRemoteObject
 */
public class RMIInterfaceImpl extends UnicastRemoteObject implements RMIInterface {
	public RMIInterfaceImpl() throws RemoteException {
	}

	public String helloRMI(User user) throws RemoteException {
		System.out.println(user);
		return user.getName();
	}

	public void exit(String name) throws RemoteException {
		Registry registry = LocateRegistry.getRegistry(3348);
		try {
			registry.unbind(name);
			System.out.println("------------------绑定解除！");
		} catch (NotBoundException e) {
			e.printStackTrace();
		} finally {
			System.exit(-1);
		}
	}
}
