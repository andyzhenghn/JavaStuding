package Package11Object;

/**
 * equals方法判断两个对象是否相等
 * 引用数据类型比较的是地址值
 */

public class Demo02Equals {
    public static void main(String[] args) {
        Parent obj1 = new Parent("haha", 12);
        Parent obj2 = new Parent("hhaa", 13);
        Parent obj3 = new Parent("haha", 12);

        boolean bool1 = obj1.equals(obj2);
        System.out.println(bool1);

        obj2 = obj1;
        boolean bool2 = obj1.equals(obj2);
        System.out.println(bool2);

        boolean bool3 = obj1.equals(obj3);
        System.out.println(bool3);
    }
}