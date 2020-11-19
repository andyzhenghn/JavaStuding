package com.study.LXF01.Package06Reflection;

import java.lang.reflect.Constructor;

public class InvokeConstructor {
    public static void main(String[] args) throws Exception {
        // 获取构造方法 Integer(int)
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        // 获取构造方法 Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer)  cons2.newInstance("456");
        System.out.println(n2);
    }
}

/**
 * 小结：
 * Constructor对象封装了构造方法的所有信息
 * 通过 Class实例的方法可以获取 Constructor实例：getConstructor(), getConstructors(), getDeclaredConstructor(), getDeclaredConstructors()
 * 通过 Constructor实例可以创建一个实例对象：newInstance(Object...parameters)；通过设置 setAccessible(true)来访问非 public构造方法
 */
