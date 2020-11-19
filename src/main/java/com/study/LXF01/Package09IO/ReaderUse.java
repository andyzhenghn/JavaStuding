package com.study.LXF01.Package09IO;

import java.io.*;

/**
 * Reader是一个字符流，以 char为单位读取
 * InputStream是字节流，以 byte为单位读取
 */

public class ReaderUse {
    public void readFile() throws IOException {
        Reader reader = new FileReader("src/readme.txt"/* , StandardCharsets.UTF_8 */);
        for (;;) {
            int n = reader.read();
            if (n == -1) {
                break;
            }
            System.out.println((char) n);
        }
        reader.close();
    }

    public void readFile1() throws IOException {
        try (Reader reader = new FileReader("src/readme.txt")) {

        }
    }

    public void readFile2() throws IOException {
        try (Reader reader = new FileReader("src/readme.txt")) {
            char[] buffer = new char[1000];
            int n;
            while ((n = reader.read(buffer)) != -1) {
                System.out.println("read " + n + " chars.");
            }
        }
    }

    // CharArrayReader
    public void readFile3() throws IOException {
        try (Reader reader = new CharArrayReader("Hello".toCharArray())) {

        }
    }

    // StringReader
    public void readFile4() throws IOException {
        try (Reader reader = new StringReader("Hello")) {

        }
    }
}

/**
 * 小结
 * Reader定义了所有字符输入流的超类
 *  FileReader实现了文字字符流输入，使用时需要制定编码
 *  CharArrayReader和 StringReader可以在内存中模拟一个字符流输入
 * Reader是基于 InputStream构造的，可以通过 InputStreamReader在制定编码的同时将任何 InputStream转换为 Reader
 * 总是使用 try (resource)保证 Reader正确关闭
 */
