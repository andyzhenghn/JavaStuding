package com.study.LXF01.Package09IO;

import java.io.*;

/**
 * Writer是字符流，以 char为单位
 */

public class WriterUse {
    public void readFile() throws IOException {
        try (Writer writer = new FileWriter("readme.txt"/* , StandardCharsets.UTF_8 */)) {
            writer.write("H");
            writer.write("Hello".toCharArray());
            writer.write("Hello");
        }
    }

    // CharArrayWriter
    public void readFile1() throws IOException {
        try (CharArrayWriter writer = new CharArrayWriter()) {
            writer.write(65);
            writer.write(66);
            writer.write(67);
            char[] data = writer.toCharArray();
        }
    }

    // StringWriter

    // OutputStreamWriter
    public void readFile2() throws IOException {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("readme.txt"), "UTF-8")) {

        }
    }
}

/**
 * 小结
 * Writer定义了所有字符输出流的超类
 *  FileWriter实现了文件字符流输出
 *  CharArrayWriter和 StringWriter在内存中模拟一个字符流输出
 * 使用 try(resource)保证 Writer正确关闭
 * Writer是基于 OutputStream构造的，可以通过 OutputStream将 OutputStream转换为 Writer，转换时需要制定编码
 */
