package com.study.LXF01.Package07Generic;

public class GenericClass<T> /** <T, K> */
{
    private T first;
    private T last;

    public GenericClass(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 静态泛型方法应该使用其他类型区分
    public static <K> GenericClass<K> create(K first, K last) {
        return new GenericClass<K>(first, last);
    }
}

/**
 * 小结：
 * 编写泛型时，需要定义泛型类型 <T>
 * 静态方法不能被告引用泛型类型 <T>，必须定义其他类型（例如 <K>）来实现静态泛型方法
 * 泛型可以同时定义多种类型，例如 Map<K, V>
 */
