package com.cc.proxy.remoteProxy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/2 10:17
 * @Description RMIInterface 远程接口。为方便网络传输，接口的所有参数类型和返回类型都必须是可序列化的
 */
public interface RMIInterface extends Remote {
	public String helloRMI(User user) throws RemoteException;

	public void exit(String name) throws RemoteException;
}
