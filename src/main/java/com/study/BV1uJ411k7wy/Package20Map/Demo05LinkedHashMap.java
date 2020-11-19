package com.study.BV1uJ411k7wy.Package20Map;

import java.util.LinkedHashMap;

public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        // 保证顺序
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("h", 1);
        map.put("ha", 2);
        map.put("hah", 3);
        map.put("haha", 1);

        System.out.println(map);
    }
}
