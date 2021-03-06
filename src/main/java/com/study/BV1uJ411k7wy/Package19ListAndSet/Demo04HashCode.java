package com.study.BV1uJ411k7wy.Package19ListAndSet;

/**
 * 哈希值：是一个十进制的整数，由系统随机生成（对象的地址值，逻辑地址，不是实际存储的物理地址）
 * 在 Object类中有一个方法去获取对象的哈希值
 * int hashCode() 返回该对象的哈希值
 */

public class Demo04HashCode {
    public static void main(String[] args) {
        Person person = new Person("hah", 13);
        int h1 = person.hashCode();
        System.out.println(h1);

        Person person1 = new Person("jj", 12);
        int h2 = person1.hashCode();
        System.out.println(h2);

        /**
         * String类重写了 hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
