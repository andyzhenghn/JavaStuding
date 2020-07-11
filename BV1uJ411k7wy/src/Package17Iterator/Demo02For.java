package Package17Iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增加 for循环，底层使用的是迭代器，使用 for循环的格式，简化了迭代器的书写
 * 是 jdk1.5之后的新特性
 * 只能用来遍历集合和数组
 * 格式：
 * for(集合/数组的数据类型 变量名:集合名/数组名) {
 *     sout(变量名)
 * }
 */

public class Demo02For {
    public static void main(String[] args) {
        forArr();

        forCollection();
    }

    private static void forArr() {
        int[] ns = {1, 2, 3, 4, 5};

        for(int item : ns) {
            System.out.println(item);
        }
    }

    private static void forCollection() {
        Collection<Integer> ns = new ArrayList<>();
        ns.add(12);
        ns.add(13);
        ns.add(14);
        ns.add(15);
        ns.add(16);
        for(int item : ns) {
            System.out.println(item);
        }
    }
}

