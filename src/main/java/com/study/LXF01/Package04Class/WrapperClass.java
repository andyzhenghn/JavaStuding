package com.study.LXF01.Package04Class;

public class WrapperClass {
    public static void main(String[] args) {
        /**
         * Auto Boxing
         * 编译器会自动在 int -- Integer之间转型
         * int变为 Integer为 自动装箱（auto boxing）
         * Integer变为 int为 自动拆箱（auto unboxing）
         * 注意：自动装箱和自动拆箱只发生在编译阶段，目的是为了写代码
         */
        int i = 100;
        Integer n = Integer.valueOf(i);
        int x = n.intValue();

        /**
         * 不变类
         * 所有的包装类都是不变类
         * 比较时候，需要用 equals()
         */
        Integer x1 = 127;
        Integer y1 = 128;
        System.out.println(x1.equals(y1));
    }
}
/**
 * 小结：
 * java核心库提供的包装类型可以把基本类型包装为 class
 * 自动装箱和自动拆箱都是在编译期完成的（jdk >= 1.5）
 * 装箱和拆箱会影响执行效率，且拆箱时可能发生 NullPointerException
 * 包装类型的比较必须使用 equals()
 * 整数和浮点数的包装类型都继承自 Number
 * 包装类型提供了大量实用方法
 */
