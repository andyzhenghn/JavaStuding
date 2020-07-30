package Package16Internet.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("server is running...");
        for (;;) {
            Socket sock = ss.accept();
            System.out.println("connected from " + sock.getRemoteSocketAddress());
            Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread {
    Socket sock;

    public Handler (Socket sock) {
        this.sock = sock;
    }

    @Override
    public void run() {
        try (InputStream input = this.sock.getInputStream()) {
            try (OutputStream output = this.sock.getOutputStream()) {
                handle(input, output);
            }
        } catch (Exception e) {
            try {
                this.sock.close();
            } catch (IOException ioe) {

            }
        }
        System.out.println("client disconnected");
    }

    private void handle(InputStream input, OutputStream output) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        writer.write("hello\n");
        writer.flush();
        for(;;) {
            String s = reader.readLine();
            if (s.equals("byte")) {
                writer.write("bye\n");
                writer.flush();
                break;
            }
            writer.write("ok: " + s + "\n");
            writer.flush();
        }
    }
}

/**
 * 小结
 * 使用 java进行 tcp编程时，需要使用 Socket模型
 *  服务器端用 ServerSocket监听指定端口
 *  客户端用 Socket(InetAddress, port)连接服务器
 *  服务器端用 accept()接收连接并返回 Socket
 *  双方通过 Socket打开 InputStream/OutputStream读写数据
 *  服务器端通常使用多线程同时处理多个客户端连接，利用线程池可大幅提升效率
 *  flush()用于强制输出缓冲区到网络
 */
