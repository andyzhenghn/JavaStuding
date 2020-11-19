package com.study.LXF01.Package06Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetField {
    public static void main(String[] args) throws Exception {
        Field f = String.class.getDeclaredField("value");
        f.getName();
        f.getType();
        int m = f.getModifiers();
        Modifier.isFinal(m);
        Modifier.isPublic(m);
        Modifier.isProtected(m);
        Modifier.isPrivate(m);
        Modifier.isStatic(m);
    }
}

/**
 * 小结：
 * java的反射 api提供的 Field类封装了字段的所有信息
 * 通过 Class实例的方法可以获取 Field实例：getField(), getFields(), getDeclaredField(), getDeclaredFields()
 * 通过 Field实例可以获取字段信息：getName(), getType(), getModifiers()
 * 通过 Field实例可以读取或设置某个对象的字段，如果存在访问限制，要首先调用 setAccessible(true)来访问非 public字段
 * 通过反射读写字段是一种非常规方法，它会破坏对象的封装
 */
