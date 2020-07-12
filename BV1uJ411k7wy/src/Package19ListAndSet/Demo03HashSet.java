package Package19ListAndSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * java.util.set接口 extends Collection类
 * Set类特点：
 *  1. 不允许存储重复的元素
 *  2. 没有索引，不能使用带索引的方法，不能使用普通 for循环
 *
 * java.util.hashSet接口 implements Set接口
 * HashSet特点：
 *  1. 不允许存储重复的元素
 *  2. 没有索引，不能使用普通 for
 *  3. 是个无序的集合，存储顺序和取出顺序可能不同
 *  4. 底层是哈希表
 *
 * HashSet集合存储数据的结构（哈希表）
 * jdk1.8版本之前：哈希表 = 数组 + 链表
 * jdk1.8版本之后：哈希表 = 数组 + 链表
 *               哈希表 = 数组 + 红黑树（提高查询速度）
 */

public class Demo03HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        /**
         * add方法
         * 1. 会先调用 hashCode()方法查看是否有相同的 hash值
         * 2. 再使用 equals()方法查看是否相同
         */
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer num : hashSet) {
            System.out.println(num);
        }

    }
}
