package com.study.LXF01.Package02Base;

/**
 * java程序的入口是 main方法，而 main方法可以接受一个命令行参数，它是一个 String[]数组
 * 这个命令行参数由 JVM接收用户输入并传给 main方法
 */

public class MainArgs {
    public static void main(String[] args) {
        // 实现一个 -version参数，打印程序版本号
        for (String arg : args) {
            System.out.println(arg);
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
