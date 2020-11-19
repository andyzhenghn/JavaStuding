package com.study.BV1uJ411k7wy.Package08Polymophism;

/**
 * 代码当中体现多态性：父类引用指向子类对象
 * 
 * 向上转型，一定是安全的
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 或者：
 * 接口名称 对象名 = new 实现类名称();
 */

public class Demo01Polymorphism {
    public static void main(String[] args) {
        Parent01 obj = new Child01();
        // 调用的是 子类的方法，new的 谁，就是用谁的方法
        obj.method();

        // 成员变量是 父类的值，等号左边是谁，优先用谁
        System.out.println(obj.sum);
    }
}