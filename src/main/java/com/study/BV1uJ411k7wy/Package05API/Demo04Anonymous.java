package com.study.BV1uJ411k7wy.Package05API;


import com.study.BV1uJ411k7wy.Package04Class.Student;

public class Demo04Anonymous {
    public static void main(String[] args) {
        Student one = new Student("haha", 18);
        int age = one.getAge();
        System.out.println(age);

        // 匿名对象
        new Student("no one", 20).eat();
    }
}