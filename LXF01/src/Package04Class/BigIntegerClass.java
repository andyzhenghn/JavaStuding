package Package04Class;

import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        // BigInteger不会有范围限制，但缺点是速度比较慢
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi);
        byte bi1 = bi.byteValue();
        short bi2 = bi.shortValue();
        int bi3 = bi.intValue();
        long bi4 = bi.longValue();
        float bi5 = bi.floatValue();
        double bi6 = bi.doubleValue();
    }
}

/**
 * BigInteger用于任意大小整数
 * BigInteger是不变类，并且继承自 Number
 * 将 BigInteger转换为基本类型时可用 longValueExact()等方法保证能结果准确
 */