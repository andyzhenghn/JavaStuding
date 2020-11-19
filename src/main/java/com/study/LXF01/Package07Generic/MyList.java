package com.study.LXF01.Package07Generic;

public class MyList<T> {
    private T[] array;
    private int size;

    public void add(T e) {
    }

    public void remove(int index) {
    }

    public T get(int index) {
        return array[index];
    }
}

/**
 * 小结：
 * 泛型就是编写模板代码来适应任意类型
 * 泛型的好处是使用时不必对类型进行强制转换，它通过编译器对类型进行检查
 * 注意泛型的继承关系：
 * 可以把 ArrayList<Integer>向上转型为 List<Integer>(T不能变)，但不能把 ArrayList<Integer>向上转型为 ArrayList<Number>(T不能变成父类)
 */
