package com.study.BV1uJ411k7wy.Package20Map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<k,v>集合
 * Map集合的特点：
 *  1. Map集合是一个双列集合，一个元素包含两个值（一个 key，一个 value）
 *  2. Map集合中的元素，key和 value的数据类型可以相同，也可以不同
 *  3. Map集合中的元素，key不允许重复，value可以重复
 *  4. Map集合中的元素，key和 value是一一对应的
 *
 * java.util.HashMap<k,v>集合 implements Map<k,v>接口
 * HashMap集合的特点：
 *  1. HashMap集合底层是哈希表：查询的速度特别快
 *      JDK1.8之前：数组 + 单向链表
 *      JDK1.8之后：数组 + 单向链表/红黑树
 *  2. HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 *
 * java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 * LinkedHashMap集合的特点：
 *  1. LinkedHashMap集合底层是哈希表 + 链表（保证迭代的顺序）
 *  2. LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 */

public class Demo01Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // put()
        map.put("h", 1);
        map.put("ha", 2);
        map.put("hah", 3);
        map.put("haha", 1);
        System.out.println(map);

        // get()
        Integer h = map.get("h");
        System.out.println(h);

        // remove()
        Integer hah = map.remove("hah");
        System.out.println(hah);

        // containsKey()
        boolean hah1 = map.containsKey("hah");
        boolean h1 = map.containsKey("h");
        System.out.println(hah1);
        System.out.println(h1);
    }
}
