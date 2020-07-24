package Package09IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * flush()方法，将缓冲区的内容真正输出到目的地
 */

public class OutStreamUse {
    public void writeFile() throws IOException {
        OutputStream output = new FileOutputStream("out/readme.txt");
        output.write(71);
        output.write(101);
        output.write(108);
        output.close();
    }

    public void writeFile1() throws IOException {
        OutputStream output = new FileOutputStream("out/readme.txt");
        // 一次性写入若干字节
        output.write("Hello".getBytes("UTF-8"));
        output.close();
    }

    public void writeFile2() throws IOException {
        try (OutputStream output = new FileOutputStream("out/readme.txt")) {
            output.write("Hello".getBytes("UTF-8"));
        } // 编辑器在此自动写入 finally并调用 close()
    }

    // 在内存中模拟一个 OutputStream
    public void writeFile3() throws IOException {
        byte[] data;
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            output.write("Hello".getBytes("UTF-8"));
            output.write("world!".getBytes("UTF-8"));
            data = output.toByteArray();
        }
        // System.out.println(new String(data, "UTF-8"));
    }
}

/**
 * 小结：
 * java标准库的 java.io.outputStream定义了所有输出流的超类
 *  FileOutputStream实现了文件流输出
 *  ByteArrayOutputStream在内存中模拟一个字节流输出
 * 某些情况下需要手动调用 OutputStream的 flush()方法来强制输出缓冲区
 * 总是使用 try(resource)来保证 OutputStream正确关闭
 */
