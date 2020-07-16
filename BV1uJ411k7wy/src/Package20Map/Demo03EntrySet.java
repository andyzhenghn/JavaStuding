package Package20Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {
        // EntrySet()将 map的键值对都取出来放到一个 entrySet中
        Map<String, Integer> map = new HashMap<>();

        map.put("h", 1);
        map.put("ha", 2);
        map.put("hah", 3);
        map.put("haha", 1);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> obj = iterator.next();
            String key = obj.getKey();
            Integer value = obj.getValue();
            System.out.println(key + ": " + value);
        }

        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
