package com.study.LXF01.Package16Internet.UDP;

// import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        // DatagramSocket ds = new DatagramSocket(6666);
        // for (;;) {
        //     byte[] buffer = new byte[1024];
        //     DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        //     ds.receive(packet);
        //     // 收取到的数据存储在 buffer中，由 packet.getOffset(), packet.getLength()指定起始位置和长度
        //     // String s = new String(packet.getData(), packet.getOffset(), packet.getLength(), StandardCharsets.UTF_8);
        //     byte[] data = "ACK".getBytes(StandardCharsets.UTF_8);
        //     packet.setData(data);
        //     ds.send(packet);
        // }
    }
}

/**
 * 小结
 * 使用 UDP协议通信时，服务器和客户端双方无需建立连接：
 *  服务器端用 DatagramSocket(port)监听端口
 *  客户端使用 DatagramSocket.connect()指定远程地址和端口
 *  双方通过 receive()和 send()读写数据
 *  DatagramSocket没有 IO流接口，数据被直接写入 byte[]缓冲区
 */
