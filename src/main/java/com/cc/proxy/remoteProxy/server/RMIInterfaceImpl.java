package com.cc.proxy.remoteProxy;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:19
 * @Description RMIInterfaceImpl
 */
public class RMIInterfaceImpl extends UnicastRemoteObject implements RMIInterface {
	public RMIInterfaceImpl() throws RemoteException {
	}

	public void helloRMI() throws RemoteException {
		System.out.println("hello RMI");
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
