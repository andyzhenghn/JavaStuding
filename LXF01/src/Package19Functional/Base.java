package Package19Functional;

import java.util.Arrays;
import java.util.Comparator;

/**
 * FunctionalInterface
 * 只定义了单方法的接口，用注解 @FunctionalInterface标记
 */

public class Base {
    public static void main(String[] args) {
        String[] array = {"aaa", "bbb", "ccc"};

        // 匿名类方式
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // Lambda表达式
        Arrays.sort(array, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        System.out.println(String.join(", ", array));
    }
}

/**
 * 小结
 * 但方法接口被称为 FunctionalInterface
 * 接收 FunctionalInterface作为参数的时候，可以把实例化的匿名类改写成 Lambda表达式，能大大简化代码
 * Lambda表达式的参数和返回值均可由编译器自动推断
 */
