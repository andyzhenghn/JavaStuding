package Package13System;

import java.util.Arrays;

/**
 * System.currentTimeMills()
 * Returns the current time in milliseconds.
 * 
 * System.copyArray()
 * 从一个数组将多少项复制到另一个数组中
 */

public class Demo01System {
    public static void main(String[] args) {
        useCurrentTimeMillis();
        useArrayCopy();
    }

    public static void useCurrentTimeMillis() {
        int sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(end - start);
    }

    public static void useArrayCopy() {
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1, 0, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
    }
}