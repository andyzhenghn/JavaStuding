package com.study.BV1uJ411k7wy.Package16Collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * 集合和数组的区别
 * 1. 数组的长度是固定的，集合的长度不固定
 * 2. 数组中存储的是同一个类型的元素，可以存储基本数据类型值。集合存储的都是对象。而对象的类型可以不一致。在开发中一般当对象多的时候，使用集合进行存储
 * 
 * Collection接口：
 *  list接口：
 *      Vector集合
 *      ArrayList集合
 *      LinkedList集合
 *  set接口：
 *      TreeSet集合
 *      HashSet集合
 *      LinkedHashSet集合
 * 
 * Collection常用功能
 * public boolean add(E e)
 * public void clear()
 * public boolean remove(E e)
 * public boolean contains(E e) 判断当前集合中是否包含给定的对象
 * public boolean isEmpty() 判断当前集合是否为空
 * public int size()
 * public Object[] toArray() 把集合中的元素，存储在数组中
 */

public class Demo01Collection {
    public static void main(String[] args) {
        // Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        coll.add("124");
        coll.add("12");
        coll.add("121");
        coll.add("122");
        System.out.println(coll);

        boolean b1 = coll.contains("121");
        System.out.println(b1);
        if (b1) {
            coll.remove("121");
            System.out.println(coll);
        }

        boolean b2 = coll.isEmpty();
        System.out.println(b2);

        int len = coll.size();
        System.out.println(len);

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.clear();
        System.out.println(coll);        
    }
}