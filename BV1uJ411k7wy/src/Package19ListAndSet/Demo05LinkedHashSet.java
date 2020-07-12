package Package19ListAndSet;

import java.util.LinkedHashSet;

/**
 * linkedHashSet集合 extends HashSet集合
 * 特点：
 *  底层是一个哈希表（数组 + 链表/红黑树）+ 链表，多了一个链表用来记录元素的存储顺序，保证有序
 */

public class Demo05LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("www");
        linkedHashSet.add("abc");
        linkedHashSet.add("n");

        System.out.println(linkedHashSet);
    }
}
