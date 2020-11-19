package com.study.BV1uJ411k7wy.Package19ListAndSet;

/**
 * 可变参数
 */

public class Demo06VarArgs {
    public static void main(String[] args) {
        long total = sum(1, 2, 3, 4, 5);
        System.out.println(total);
    }

    public static long sum(int...nums) {
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static long sumCopy(Object...arr) {
        return 0;
    }
}
