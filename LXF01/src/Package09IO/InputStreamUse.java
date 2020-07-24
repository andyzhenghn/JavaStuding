package Package09IO;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class InputStreamUse {
    public void readFile() throws IOException {
        FileInputStream input = null;
        try {
            input = new FileInputStream("src/readme.txt");
            for (; ; ) {
                int n = input.read(); // 反复调用 read()方法，知道返回 -1
                if (n == -1) {
                    break;
                }
                System.out.println(n); // 打印 byte的值
            }
        } finally {
            input.close();
        }
    }

    public void readFile1() throws IOException {
        try (FileInputStream input = new FileInputStream("src/readme.txt")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        } // 编译器在此自动写入 finally并调用 close()
    }

    // 缓冲
    public void readFile2() throws IOException {
        try (FileInputStream input = new FileInputStream("src/readme.txt")) {
            // 定义 1000个字节大小的缓冲区
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read " + n + " byte.");
            }
        }
    }

    public void readFile3() throws IOException {
        byte[] data = {72, 101, 108, 108, 111};
        // ByteArrayInputStream可以在内存中模拟一个 InputStream
        try (InputStream input = new ByteArrayInputStream(data)) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println((char) n);
            }
        }
    }
}

/**
 * 小结：
 * java标准库的 java.io.InputStream定义了所有输入流的超类：
 *  FileInputStream实现了文件流输入
 *  ByteArrayInputStream在内存中模拟一个字节流输入
 * 总是使用 try(resource) 来保证 InputStream正确关闭
 */