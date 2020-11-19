package com.study.LXF01.Package05Exception;

public class AssertionUse {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        /**
         * 使用断言
         * 断言失败会抛出 AssertionError，导致程序结束时退出
         * 只应该用于开发和测试阶段
         * jvm默认关闭断言指令，遇到不执行
         */
        assert x >= 0;
        System.out.println(x);
    }
}

/**
 * 小结：
 * 断言是一种调试方式，断言失败后抛出 AssertionError，只能在开发和测试阶段启动断言
 * 对可恢复的错误不能使用断言，而应该抛出异常
 * 断言很少被使用，更好的方法是编写单元测试
 */
