package Package04Class;

import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        // 用分隔符拼接数组
        // this(delimiter, prefix: "", suffix: "");
        String[] names = {"Bob", "Alice", "Grace"};
        StringJoiner stringJoiner = new StringJoiner(", ");
        StringJoiner stringJoiner1 = new StringJoiner(", ", "Hello", "!");
        for (String name : names) {
            stringJoiner.add(name);
            stringJoiner1.add(name);
        }
        System.out.println(stringJoiner.toString());
        System.out.println(stringJoiner1.toString());

        // String.join()
        String s = String.join(", ", names);
        System.out.println(s);
    }
}

/**
 * 小结：
 * 用指定分隔符拼接字符串数组时，使用 StringJoiner或者 String.join()更方便
 * 用 StringJoiner拼接字符串时，还可以额外附加一个"开头"和"结尾"
 */