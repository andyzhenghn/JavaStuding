package Package04Class;

import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalClass {
    public static void main(String[] args) {
        // BigDecimal可以表示一个任意大小且精度完全准确的浮点数
        BigDecimal bd = new BigDecimal("123.67");
        BigDecimal bd2 = bd.multiply(bd);
        System.out.println(bd2);

        // scale()表示小数位数
        System.out.println(bd2.scale());

        // stripTrailingZeros()将格式化为一个相等的，但去掉了末尾 0的 bigDecimal
        BigDecimal bd3 = new BigDecimal("123.50000");
        BigDecimal bd3Without0 = bd3.stripTrailingZeros();
        System.out.println(bd3.scale());
        System.out.println(bd3Without0.scale());

        // divideAndRemainder()方法，返回的数组包含两个 BigDecimal，分别是 商和余数
        BigDecimal[] dr = bd3.divideAndRemainder(bd);
        System.out.println(Arrays.toString(dr));

        /**
         * 比较
         * equals()方法要求两个 BigDecimal的值相等，其 scale()也相等
         * compareTo() 可以根据两个值的大小分别返回负数，正数和 0，分别表示小于、大于和等于
         */
        System.out.println(bd.equals(bd2));
        System.out.println(bd.compareTo(bd2));
    }
}

/**
 * 小结：
 * BigDecimal用于表示精确的小数，常用于财务计算
 * 比较 BigDecimal的值是否相等，必须使用 compareTo()而不是使用 equals()
 */
