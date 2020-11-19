package com.study.LXF01.Package03OOP;

public class OOPStatic {
    public String name;
    public static int age;

    public static void setAge(int val) {
        age = val;
    }
}

/**
 * 静态字段属于所有实例"共享"的字段，实际上是属于 class字段
 * 调用静态方法不需要实例，无法访问 this，但可以访问静态字段和其他静态方法
 * 静态方法常用于工具类和辅助方法
 */
