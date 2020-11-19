package com.study.BV1uJ411k7wy.Package17Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * 常用方法：
 *  boolean hasNext() 如果仍有元素可以迭代，返回 true
 *  E next() 返回迭代的下一个元素，取出集合中的下一个元素
 *
 *  Iterator是一个接口，无法直接使用，需要使用 Iterator接口的实现类对象
 *  Collection接口有一个方法，叫 iterator()，这个方法返回的就是迭代器的实现类对象
 *      Iterator<E> iterator() 返回在此 collection的元素上进行迭代的迭代器
 */

public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("1");
        coll.add("11");
        coll.add("111");
        coll.add("1111");
        coll.add("11111");
        coll.add("111111");

        Iterator<String> iter = coll.iterator();
        while (iter.hasNext()) {
            String e = iter.next();
            System.out.println(e);
        }

        for ( Iterator<String> it = coll.iterator(); it.hasNext();) {
            String e = it.next();
            System.out.println(e);
        }
    }
}
