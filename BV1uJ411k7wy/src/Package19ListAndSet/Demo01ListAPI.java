package Package19ListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.list接口 extends Collection接口
 * List接口的特点：
 *  1. 有序的集合，存储元素和取出元素的顺序是一样的
 *  2. 有索引，包含了一些带索引的方法
 *  3. 允许存储复杂的元素
 * List接口的方法：
 *  1. get()
 *  2. add()
 *  3. set()
 *  4. remove()
 * 注意：
 *  操作索引的时候，一定要防止越界的行为
 */

public class Demo01ListAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qw");
        list.add("as");
        list.add("zx");
        list.add("ed");
        list.add("esd");

        System.out.println(list);

        String s = list.get(2);
        System.out.println(s);

        System.out.println("------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------");

        for (String child : list) {
            System.out.println(child);
        }

        System.out.println("------");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------");

        list.set(3, "new");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
