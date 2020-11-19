package com.study.LXF01.Package07Generic;

/**
 * 泛型是一种类似"模板代码"的技术，不同语言的泛型实现方式不一定相同。
 * java语言的泛型实现方式是擦拭法（Type Erasure）
 * 所谓擦拭法是指：虚拟机对泛型其实一无所知，所有的工作都是编译器做的，导致了：
 *  编译器把类型 <T>视为 object
 *  编译器根据 <T>实现安全的强制转型
 */

public class TypeErasure {
    public static void main(String[] args) {
        /**
         * java泛型的局限
         * 1. <T>不能是基本类型，因为实际类型是 Object, Object类型无法持有基本类型
         * 2. 无法取得带泛型的 Class
         * 3. 无法判断带泛型的类型
         * 4. 不能实例化 T类型
         */
    }
}

/**
 * 小结：
 * java的泛型是采用 擦拭法实现的
 * 擦拭法决定了泛型<T>:
 *  不能是基本类型，例如 int
 *  不能获取带泛型类型的 Class，例如 Pair<String>.class
 *  不能判断带泛型类型的类型，例如 x instanceof Pair<String>
 *  不能实例化 T类型，例如 new T()
 * 泛型方法要防止重复定义方法，例如 public boolean equals(T obj)
 * 子类要获取父类的泛型类型<T>
 */
