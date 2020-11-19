package com.study.LXF01.Package06Reflection;

import java.lang.reflect.Method;

public class InvokeMethod {
    public static void main(String[] args) throws Exception {
        // lass stdClass = GetField.class;

        // 调用方法
        // String对象
        String s = "Hello world";
        // 获取 String substring(int)方法，参数为 int
        Method m = String.class.getMethod("substring", int.class);
        // 在 s对象上调用该方法并获取结果：
        String r = (String) m.invoke(s, 6);
        System.out.println(r);

        // 调用静态方法
        // 获取 Integer.parseInt(String)方法，参数为 String
        Method m1 = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果
        Integer n = (Integer) m1.invoke(null, "12345");
        System.out.println(n);

        /**
         * 调用非 public方法
         * 先通过 Method.setAccessible(true)允许其调用
         */
    }
}

/**
 * 小结：
 * java的反射 api提供的 Method对象封装了方法的所有信息：
 * 通过 Class实例的方法可以获取 Method实例：getMethod(), getMethods(), getDeclaredMethod(), getDeclaredMethods()
 * 通过 Method实例可以获取方法信息：getName(), getReturnType(), getParameterTypes(), getModifiers()
 * 通过 Method实例可以调用某个对象的方法：Object invoke(Object instance, Object... parameters)
 * 通过设置 setAccessible(true)来访问非 public方法
 * 通过反射调用方法时，仍然遵循多态原则
 */