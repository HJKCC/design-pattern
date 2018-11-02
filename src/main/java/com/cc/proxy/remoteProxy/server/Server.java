package com.cc.proxy.remoteProxy.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:19
 * @Description Server 远程服务程序，
 */
public class Server {
	public static void main(String[] args) {
		try {
			RMIInterface rmiInterface = new RMIInterfaceImpl();
			Registry registry = LocateRegistry.createRegistry(3348);
			registry.rebind("RMIInterface", rmiInterface);

			System.out.println("------------------绑定成功！");
		} catch (RemoteException e) {
			System.out.println("创建远程对象发生异常！");
			e.printStackTrace();
		}
	}
}
