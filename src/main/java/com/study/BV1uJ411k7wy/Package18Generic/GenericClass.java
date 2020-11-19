package com.study.BV1uJ411k7wy.Package18Generic;

/**
 * 定义一个含有泛型的类，模拟 ArrayList集合
 * 泛型是一个未知的数据类型，当不确定什么数据类型的时候，可以使用泛型
 * 泛型可以接受任意的数据类型
 * 创建对象的时候确定泛型的数据类型
 */

public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
