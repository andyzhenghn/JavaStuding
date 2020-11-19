package com.study.BV1uJ411k7wy.Package19ListAndSet;

import java.util.LinkedList;

/**
 * java.util.linkedList集合 implements List接口
 * 特点：
 *  1. 底层是一个链表结构，查询慢，增删快
 *  2. 里面包含大量增删首尾方法
 * 注意：
 *  使用 LinkedList集合不能使用多态
 * 方法：
 *  1. addFirst()
 *  2. addLast()
 *  3. push()
 *  4. getFirst()
 *  5. getLast()
 *  6. removeFirst()
 *  7. removeLast()
 *  8. pop()
 *  9. isEmpty()
 *  10. clear()
 */

public class Demo02LinkedList {
    public static void main(String[] args) {
        useAdd();
    }

    private static void useAdd() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("c");
        list.push("d");
        System.out.println(list);
        String first = list.getFirst();
        System.out.println(first);
        String last = list.getLast();
        System.out.println(last);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.pop();
        System.out.println(list);

        list.clear();
        boolean b = list.isEmpty();
        System.out.println(b);
    }
}
