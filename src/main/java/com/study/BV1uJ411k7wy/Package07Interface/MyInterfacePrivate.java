package com.study.BV1uJ411k7wy.Package07Interface;

/**
 * 抽取共有方法，不应该让实例使用，应该私有化
 * 
 * 解决方法
 * 从 java 9开始，接口当中允许定义私有方法
 * 1. 普通私有方法，解决多个默认方法之间重复代码问题
 *  格式：
 *  private 返回值类型 方法名称(参数列表) {
 *      方法体
 *  }
 * 
 * 2. 静态私有方法，解决多个静态方法之间重复代码问题
 *  格式：
 *  private static 返回值类型 方法名称(参数列表) {
 *      方法体
 *  }
 */

public interface MyInterfacePrivate {
    public default void method1() {
        System.out.println("method1");
        // defaultMethodCommon();
    }

    public default void method2() {
        System.out.println("method2");
        // defaultMethodCommon();
    }

    // private void defaultMethodCommon() {
    //     System.out.println(1);
    //     System.out.println(2);
    //     System.out.println(3);
    // }

    public static void method3() {
        System.out.println("method3");
        // staticMethodCommon();
    }

    public static void method4() {
        System.out.println("method4");
        // staticMethodCommon();
    }

    // private static void staticMethodCommon() {
    //     System.out.println(1);
    //     System.out.println(2);
    //     System.out.println(3);
    // }
}