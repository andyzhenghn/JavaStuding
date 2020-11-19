package com.study.LXF01.Package13Encryption;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Hmac算法就是一种基于密钥的消息认证算法
 * 好处：
 * HmacMD5使用的 key长度是 64字节，更安全
 * Hmac是标准算法，同样适用于 SHA-1等其他哈希算法
 * Hmac输出和原有的哈希算法长度一致
 */

public class Hmac {
    public static void main(String[] args) throws Exception {
        encode();
        decode();
    }

    public static void encode() throws Exception {
        // 1. 通过名称 HmacMD5获取 KeyGenerator实例
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacMD5");
        // 2. 通过 KeyGenerator创建一个 SecretKey实例
        SecretKey key = keyGen.generateKey();

        byte[] skey = key.getEncoded();
        System.out.println(new BigInteger(1, skey).toString(16));
        // 3. 通过名称 HmacMD5获取 Mac实例
        Mac mac = Mac.getInstance("HmacMd5");
        // 4. 用 SecretKey初始化 Mac实例
        mac.init(key);
        // 5. 对 Mac实例反复调用 update(byte[])输入数据
        mac.update("HelloWorld".getBytes("UTF-8"));
        // 6. 调用 Mac实例的 doFinal()获取最终的哈希值
        byte[] result = mac.doFinal();
        System.out.println(new BigInteger(1, result).toString(16));
    }

    public static void decode() throws Exception {
        byte[] hkey = new byte[]{106, 70, -110, 125, 39, -20, 52, 56, 85, 9, -19, -72, 52, -53, 52, -45, -6, 119, -63,
                30, 20, -83, -28, 77, 98, 109, -32, -76, 121, -106, 0, -74, -107, -114, -45, 104, -104, -8, 2, 121, 6,
                97, -18, -13, -63, -30, -125, -103, -80, -46, 113, -14, 68, 32, -46, 101, -116, -104, -81, -108, 122,
                89, -106, -109};
        SecretKey key = new SecretKeySpec(hkey, "HmacMD5");
        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(key);
        mac.update("HelloWorld".getBytes("UTF-8"));
        byte[] result = mac.doFinal();
        System.out.println(Arrays.toString(result));
    }
}

/**
 * 小结
 * Hmac算法是一种很标准的基于秘钥的哈希算法，可以配合MD5、SHA-1等哈希算法，计算的摘要长度和原摘要算法长度相同
 */
