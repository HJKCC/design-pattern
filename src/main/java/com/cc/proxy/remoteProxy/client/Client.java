package com.cc.proxy.remoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:47
 * @Description Client 客户端
 */
public class Client {
	public static void main(String[] args) {
		try {
			RMIInterface rmiInterface = (RMIInterface) Naming.lookup("rmi://127.0.0.1:3348/RMIInterface");
			rmiInterface.helloRMI();
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
