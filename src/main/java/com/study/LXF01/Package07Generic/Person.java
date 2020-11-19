package com.study.LXF01.Package07Generic;

public class Person implements Comparable<Person> {
    String name;
    int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

/**
 * 小结：
 * 使用泛型时，把泛型参数 <T>替换为需要的 class类型，例如：ArrayList<String>,  ArrayList<Number>
 * 可以省略编译器能自动推断出的类型，例如：List<String> list = new ArrayList<>()
 * 不指定泛型参数类型时，编译器会给出警告，且只能将 <T>视为 Object类型
 * 可以在接口中定义泛型类型，实现此接口的类必须实现正确的泛型类型
 */
