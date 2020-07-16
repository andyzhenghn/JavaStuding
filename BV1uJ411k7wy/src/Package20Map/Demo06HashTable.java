package Package20Map;

import java.util.Hashtable;

/**
 * Hashtable线程安全的
 * 不能将 null设为 key或者 value
 * 子类 Properties集合是唯一和 IO流结合的集合
 */

public class Demo06HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> stringIntegerHashtable = new Hashtable<>();
        // stringIntegerHashtable.put(null, 1);
        // stringIntegerHashtable.put(null, null);
        stringIntegerHashtable.put("ha", 2);
    }
}
