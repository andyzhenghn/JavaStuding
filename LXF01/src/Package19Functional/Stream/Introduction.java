package Package19Functional.Stream;

public class Introduction {
    public static void main(String[] args) {
        Stream<BigInteger> naturals = createNaturalStream(); // 全体自然数
    }

    private static Stream<BigInteger> createNaturalStream() {
        // return new Stream();
    }
}

/**
 * 小结
 * Stream API的特点是：
 *  Stream API提供了一套新的流式处理的抽象序列
 *  Stream API支持函数式编程和链式操作
 *  Stream可以表示无限序列，并且在大多数情况下是惰性求值的
 */