package Package16Internet.HTTP;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class ConnectionUse {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.bing.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setUseCaches(false);
        conn.setConnectTimeout(5000); // 请求超时 5秒
        // 设置 http头
        conn.setRequestProperty("Accept", "*/*");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 11; Windows NT 5.1)");
        conn.connect();
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("bad response");
        }
        // 获取所有响应 Header
        Map<String, List<String>> map = conn.getHeaderFields();
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        // 获取响应内容
        InputStream input = conn.getInputStream();
    }
}

/**
 * 小结
 * java提供了 HttpClient作为新的 HTTP客户端编程接口用于取代老的 HttpURLConnection接口
 * HttpClient使用链式调用并通过内置的 BodyPublishers和 BodyHandlers来更方便地处理数据
 */
