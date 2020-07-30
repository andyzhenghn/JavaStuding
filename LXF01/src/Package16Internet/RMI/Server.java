package Package16Internet.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws RemoteException {
        System.out.println("create World clock remote service...");
        // 实例化
        WorldClock worldClock = new WorldClockService();
        // 将此服务转换为远程服务接口
        WorldClock skeleton = (WorldClock) UnicastRemoteObject.exportObject(worldClock, 0);
        // 将 RMI服务注册到 1099端口
        Registry registry = LocateRegistry.createRegistry(1099);
        // 注册此服务，服务名为 WorldClock
        registry.rebind("WorldClock", skeleton);
    }
}
