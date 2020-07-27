package Package14Multithreading;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * java.util.concurrent包提供了一些并发集合类
 * interface    non-thread-safe             thread-safe
 * List         ArrayList               CopyOnWriteArrayList
 * Map          HashMap                 ConcurrentHashMap
 * Set          HashSet/TreeSet         CopyOnWriteArraySet
 * Queue        ArrayDeque/LinkedList   ArrayBlockingQueue/LinkedBlockingQueue
 * Deque        ArrayDeque/LinedList    LinkedBlockingDeque
 */

public class Concurrent {
    public static void main(String[] args) {
        Map<String, String> map0 = new HashMap<>();
        // 用一个包装类包装了非线程安全的 Map
        Map ThreadSafeMap = Collections.synchronizedMap(map0);

        Map<String, String> map = new ConcurrentHashMap<>();
    }
}

/**
 * 小结
 * 使用 java.util.concurrent包提供的线程安全的并发集合可以大大简化多线程编程
 * 多线程同时读写并发集合是安全的
 * 尽量使用 java标准库提供的并发集合，避免自己编写同步代码
 */
