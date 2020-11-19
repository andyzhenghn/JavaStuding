package com.study.BV1uJ411k7wy.Package20Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("h", 1);
        map.put("ha", 2);
        map.put("hah", 3);

        // keySet()将 Map中的所有 key装到一个 set中
        Set<String> set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

    }
}
