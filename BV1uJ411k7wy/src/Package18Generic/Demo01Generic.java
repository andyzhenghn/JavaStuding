package Package18Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        useGeneric();
    }

    private static void useGeneric() {
        /**
         * 创建集合对象，使用泛型
         * 好处：
         *  1. 避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
         *  2. 把运行期异常，提升到编译期
         * 弊端：
         *  泛型是什么类型，只能存储什么类型
         */
        ArrayList<String> arr = new ArrayList<>();
        arr.add("haha");
        arr.add("haha1");
        arr.add("haha2");
        Iterator<String> it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void noUseGeneric() {
        /**
         * 创建集合对象，不使用泛型
         * 好处：
         *  集合不适用泛型，默认的类型就是 Object类型，可以存储任意类型数据
         * 弊端：
         *  不安全，会引发异常
         */
        ArrayList l = new ArrayList();
        l.add("123");
        l.add(1);

        Iterator ia = l.iterator();
        while (ia.hasNext()) {
            Object obj = ia.next();

            // 向下转型，使用 String的方法
            String s = (String) obj;
            System.out.println(s.length());
        }
    }
}
