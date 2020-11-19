package com.study.LXF01.Package16Internet.RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        // 连接到服务器 localhost
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        // 查找名称为 WorldClock的服务并强制转型为 WorldClock接口
        WorldClock worldClock = (WorldClock) registry.lookup("WorldClock");
        // 正常调用接口方法
        LocalDateTime now = worldClock.getLocalDateTime("Asia/Shanghai");
        System.out.println(now);
    }
}

/**
 * 小结
 * java提供了 RMI实现远程方法调用
 * RMI通过自动生成 stub（客户端的实现类）和 skeleton（服务器端的网络服务类）实现网络调用，客户端只需要查找服务并获得接口实例，服务器端只需要编写实现类并注册为服务
 * RMI的序列化和反序列化可能会造成安全漏洞，因此调用双方必须是内网互相信任的机器，不要把 1099端口暴露在公网上作为对外服务
 */
