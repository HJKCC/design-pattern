package com.cc.proxy.remoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:17
 * @Description RMIInterface 远程接口
 */
public interface RMIInterface extends Remote {
	public void helloRMI() throws RemoteException;

	public void exit(String name) throws RemoteException;
}
