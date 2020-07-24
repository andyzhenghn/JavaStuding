package Package09IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadClasspath {
    public ReadClasspath() {
    }

    public static void main(String[] args) throws IOException {
        try (InputStream input = ReadClasspath.class.getResourceAsStream("/default.properties")) {
            if (input != null) {

            }
        }

        Properties props = new Properties();
        props.load(inputStreamFromClassPath("/default.properties"));
        props.load(inputStreamFromClassPath("./conf.properties"));
    }

    private static InputStream inputStreamFromClassPath(String path) {
        return new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }
}

/**
 * 小结
 * 把资源存储在 classpath中可以避免文件路径依赖
 * Class对象的 getResourceAsStream()可以从 classpath中读取指定资源
 * 根据 classpath读取资源时，需要检查返回的 InputStream是否为 null
 */