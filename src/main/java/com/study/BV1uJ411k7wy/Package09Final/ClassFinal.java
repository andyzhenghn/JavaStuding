package com.study.BV1uJ411k7wy.Package09Final;

/**
 * 当 final关键字用来修饰一个类的时候
 * 含义：
 *  当前这个类不能有任何的子类
 * 注意：
 *  一个类如果是 final的，那么其中所有的成员方法都无法进行覆盖重写
 */

public final class ClassFinal {
    public void name() {
        System.out.println("方法执行");
    }
}