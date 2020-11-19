package com.study.LXF01.Package19Functional.Stream;

import java.util.stream.*;

public class ReduceUse {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);

        int s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .reduce(1, (acc, n) -> acc * n);
        System.out.println(s);
    }
}

/**
 * 小结
 * reduce()方法将一个 Stream的每个元素依次作用于 BinaryOperator，并将结果合并
 * reduce()是聚合方法，聚合方法会立刻对 Stream进行计算
 */