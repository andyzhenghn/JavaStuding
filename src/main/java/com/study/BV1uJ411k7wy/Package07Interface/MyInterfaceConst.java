package com.study.BV1uJ411k7wy.Package07Interface;

/**
 * 接口当中也可以定义”成员变量“，但是必须使用 public static final三个关键字进行修饰
 * 从效果来看，这其实就是接口的【常量】
 * 格式：
 * public static final 数据类型 常量名称 = 数据值;
 * 备注：
 * 一旦使用 final关键字进行修饰，说明不可变
 * 注意事项：
 * 1. 接口中的常量，可以省略 public static final，注意：可省略
 * 2. 接口中的常量，必须进行赋值，不能不进行赋值
 * 3. 接口中的常量名称，推荐使用完全大写字母，用下划线连接的命名格式
 */

public interface MyInterfaceConst {
    public static final int NUM_USE = 10;
}