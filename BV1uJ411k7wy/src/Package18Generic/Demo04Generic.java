package Package18Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型的通配符：
 *  ?:代表任意的数据类型
 * 使用方式：
 *  不能创建对象使用
 *  只能作为方法的参数使用
 */

public class Demo04Generic {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        printArr(l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("ha");
        l2.add("hah");
        l2.add("hahaa");
        printArr(l2);
    }

    private static void printArr(ArrayList<?> l) {
        Iterator<?> ti = l.iterator();
        while(ti.hasNext()) {
            System.out.println(ti.next());
        }
    }
}
