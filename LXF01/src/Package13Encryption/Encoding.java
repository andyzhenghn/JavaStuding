package Package13Encryption;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Encoding {
    public static void main(String[] args) throws Exception {
        URLEncoding();
        Base64Encoding();
    }

    /**
     * URL编码
     * 对字符进行编码，表示成 %xx的形式
     * @throws Exception
     */
    public static void URLEncoding() throws Exception {
        String encoded = URLEncoder.encode("中文！", String.valueOf(StandardCharsets.UTF_8));
        System.out.println(encoded);

        String decoded = URLDecoder.decode("%E4%B8%AD%E6%96%87%EF%BC%81", String.valueOf(StandardCharsets.UTF_8));
        System.out.println(decoded);
    }

    /**
     * Base64编码
     * 对二进制数据进行编码，表示成文本格式
     * 在 java中，二进制数据就是 byte[]数组
     */
    public static void Base64Encoding() {
        byte[] input = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);

        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));

        // 针对 URL的 Base64编码
        // 仅仅把 +变成 -，/变成 _
        byte[] input1 = new byte[] {0x01, 0x02, 0x7f, 0x00};
        String b64encoded1 = Base64.getUrlEncoder().encodeToString(input1);
        System.out.println(b64encoded1);

        byte[] output1 = Base64.getUrlDecoder().decode(b64encoded1);
        System.out.println(Arrays.toString(output1));
    }
}

/**
 * 小结
 * URL编码和 Base64编码都是编码算法，它们不是加密算法
 * URL编码的目的是把任意文本数据编码为 %前缀表示的文本，便于浏览器和服务器处理
 * Base64编码的目的是把任意二进制数据编码为文本，但编码后数据量会增加 1/3
 */
