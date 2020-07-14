package Package04Class;

import java.security.SecureRandom;
import java.util.Random;

public class CommonToolClass {
    public static void main(String[] args) {
        /**
         * Math
         * StrictMath提供了跟 Math几乎相同的方法，但能保证所有平台（x86，arm）的计算结果相同
         */
        Math.abs(-100);
        Math.max(100, 99);
        Math.pow(2, 10); // n次方
        Math.sqrt(2);    // 开方
        Math.exp(2);     // e的 n次方
        Math.log(4);     // 计算以 e为底的对数
        Math.log10(100); // 计算以 10为底的对数
        Math.sin(3.14);
        Math.cos(3.14);
        Math.tan(3.14);
        Math.asin(1.0);
        Math.acos(1.0);
        double pi = Math.PI;
        double e = Math.E;
        Math.random();

        /**
         * Random
         * 创建伪随机数
         * 如果不给定种子，就使用系统当前时间戳作为种子
         * 指定种子，就会得到完全确定的随机数序列
         */
        Random r = new Random();
        r.nextInt();
        r.nextInt(10); // 生成 [0, 10)之间的 int
        r.nextLong();
        r.nextFloat();
        r.nextDouble();
        // 指定种子
        Random r1 = new Random(12345);
        r1.nextInt();

        /**
         * SecureRandom
         * 创建不可预测的安全的随机数
         * 无法指定种子
         * 其安全性是通过操作系统提供的安全的随机种子来生成随机数
         */
        SecureRandom sr = new SecureRandom();
        sr.nextInt(100);
    }
}

/**
 * 小结：
 * Math 数学计算
 * Random 生成伪随机数
 * SecureRandom 生成安全的随机数
 */
