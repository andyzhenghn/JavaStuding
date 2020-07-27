package Package13Encryption;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class BouncyCastle {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        /**
            // 注册 BouncyCastle
            Security.addProvider(new BouncyCastleProvider());
            // 按名称正确调用
            MessageDigest md = MessageDigest.getInstance("RipeMD160");
            md.update("HelloWorld".getBytes("UTF-8"));
            byte[] result = md.digest();
            System.out.println(new BigInteger(1, result).toString(16));
         */
    }
}

/**
 * 小结
 * BouncyCastle是一个开源的第三方算法提供商
 * BouncyCastle提供了很多 java标准库没有提供的哈希算法和加密算法
 * 使用第三方算法前需要通过 Security.addProvider()注册
 */
