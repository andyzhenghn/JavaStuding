package Package13Encryption;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hash算法又称为 摘要算法（Digest），它的作用是：对任意一组输入数据进行计算，得到一个固定长度的输出摘要
 * 特点：
 *  相同的输入一定得到相同的输出
 *  不同的输入大概率得到不同的输出
 * 目的：
 *  验证原始数据是否被篡改
 *
 * 哈希碰撞
 *  两个不同的输入得到相同的输出
 * 安全的哈希算法：
 *  碰撞概率低
 *  不能猜测输出
 *
 * 常见的哈希算法：
 *  MD5         128bits     16bytes
 *  SHA-1       160Bits     20bytes
 *  RipeMD-160  160Bits     20bytes
 *  SHA-256     256Bits     32bytes
 *  SHA-512     512Bits     64bytes
 *
 * 哈希算法的输出长度越长，就越难产生碰撞，也就越安全
 */
public class Hash {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        "hello".hashCode();
        "hello, java".hashCode();
        "hello, bob".hashCode();

        useMD5();
        useSHA1();
    }

    public static void useMD5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest();
        System.out.println(new BigInteger(1, result).toString(16));
    }

    public static void useSHA1() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest();
        System.out.println(new BigInteger(1, result).toString(16));
    }
}

/**
 * 小结
 * 哈希算法可用于验证数据完整性，具有防篡改检测的功能
 * 常用的哈希算法有 MD5、SHA-1等
 * 用哈希存储口令时要考虑彩虹表攻击
 */
