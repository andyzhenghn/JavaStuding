package Package19Functional.Stream;

import java.util.*;
import java.util.stream.*;

public class MapUse {
    public static void main(String[] args) {
        List.of("  Apple ", " pear ", " ORANGE ", " BaNaNa ")
            .stream()
            .map(String::trim) // 去空格
            .map(String::toLowerCase) // 变小写
            .forEach(System.out::println);
    }
}

/**
 * 小结
 * map()方法用于将一个 Stream的每个元素映射成另一个元素并转换成一个新的 Stream
 * 可以将一种元素类型转换为另一种元素类型
 */