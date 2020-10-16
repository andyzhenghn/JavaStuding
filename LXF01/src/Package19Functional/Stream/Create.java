package Package19Functional.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Create {
    public static void main(String[] args) {
        // Stream.of
        Stream<String> stream = Stream.of("a", "b", "c", "d");
        // forEach()方法相当于内部循环调用
        // 可传入符合 Consumer接口的 void accept(T t)的方法引用
        stream.forEach(System.out::println);

        // 基于一个数组或者 Collection
        Stream<String> stream1 = Arrays.stream(new String[] {"a", "b", "c"});
        // Stream<String> stream2 = List.of("x", "y", "z").stream();
        stream1.forEach(System.out::println);
        // stream2.forEach(System.out::println);

        // 基于 Supplier
        Stream<Integer> s = Stream.generate(new NatualSupplier());
        // 注意：无限序列必须先变成有限序列再打印
        Stream<Object> natual = null;
        natual.limit(20).forEach(System.out::println);
    }
}

class NatualSupplier implements Supplier<Integer> {
    int n = 0;
    public Integer get() {
        n++;
        return n;
    }
}

/**
 * 小结
 * 创建 Stream的方法有：
 *  通过指定元素、指定数组、指定 Collection创建 Stream
 *  通过 Supplier创建 Stream，可以是无限序列
 *  通过其他类的相关方法创建
 * 基本类型的 Stream有 IntStream、LongStream和 DoubleStream
 */