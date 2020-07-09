package K_Object;

/**
 * 默认的 toString方法返回的是对象的引用地址
 * 可以重写 toString
 */

public class Demo01ToString {
    public static void main(String[] args) {
        Parent obj = new Parent("haha", 15);

        String str = obj.toString();
        System.out.println(str);
    }
}