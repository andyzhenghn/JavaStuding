package com.study.LXF01.Package09IO;

import java.io.*;

/**
 * 通过一个 基础组件再叠加各种 附加功能组件的模式，叫做 Filter模式（或者装饰器模式：Decorator）
 * 可以通过少量类来实现各种功能的组合
 */

public class FilterMode {
    public static void main(String[] args) throws IOException {
        byte[] data = "hello, world!".getBytes("UTF-8");
//        try (CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))) {
//            int n;
//            while ((n = input.read()) != -1) {
//                System.out.println((char) n);
//            }
//            System.out.println("Total read" + input.getBytesRead() + " bytes");
//        }
    }
}

//class CountInputStream extends FileInputStream {
//    private int count = 0;
//
//    CountInputStream(InputStream in) {
//        super(in);
//    }
//
//    public int getBytesRead() {
//        return this.count;
//    }
//
//    public int read() throws IOException {
//        int n = in.read();
//        if (n != -1) {
//            this.count ++;
//        }
//        return n;
//    }
//
//    public int read(byte[] b, int off, int len) throws IOException {
//        int n = in.read(b, off, len);
//        this.count += n;
//        return n;
//    }
//}


/**
 * 小结
 * java的 IO标准库使用 Filter模式为 InputStream和 OutputStream增加功能
 *  可以把一个 InputStream和任意个 FilterInputStream组合
 *  可以把一个 OutputStream和任意个 FilterOutputStream组合
 * Filter模式可以在运行期动态增加功能（Decorator模式）
 */
