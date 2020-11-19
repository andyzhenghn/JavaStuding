package com.study.LXF01.Package03OOP;

public class OOPOverload {
    public void hello() {
        System.out.println("hello world");
    }

    public void hello(String name) {
        System.out.println("hello: " + name + '!');
    }

    public void hello(String name, int age) {
        if (age > 18) {
            System.out.println("hi, " + name + '!');
        } else {
            System.out.println("hello, " + name + '!');
        }
    }
}
/**
 * 方法名相同，但各自的参数不同，称为方法重载（overload）
 * 注意：方法重载的返回值类型通常都是相同的
 *
 * 小结：
 * 方法重载是指多个方法的方法名相同，但各自的参数不同
 * 重载方法应该完成类似的功能，参考 String的 indexOf()
 * 重载方法返回值类型应该相同
 */
