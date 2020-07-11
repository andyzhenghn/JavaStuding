package Package02Base;

public class CharString {
    public static void main(String[] args) {
        // 字符类型
        char c1 = 'A';
        char c2 = '中';
        char c3 = '\u0041'; // 十六进制写法

        // 字符串类型
        String s = "12";

        // 字符串连接
        String s1 = "Hello";
        String s2 = "World";
        String finals = s1 + ' ' + s2 + '!';
        System.out.println(s);

        // 多行文本
        String mult = "first line \n" + "second line \n" + "end";
        // Java 14+ 有效
        // String mult1 = """
        //             SELECT * FROM
        //                 users
        //             WHERE id > 100
        //             ORDER BY name DESC
        //         """;

        // 字符串不可变
        String ss = "hello";
        ss = "World";
        // 字符串是引用类型，引用传递，之前的 "hello"仍然存在
        // 字符串的不可变是指字符串内容不可变

        // 空值 null，空值表示不存在，即该变量不指向任何对象
        String ss1 = null;
    }
}

/**
 * 小结：
 * java的字符串类型 char是基本类型，字符串 String是引用类型
 * 基本类型的变量是 ”持有“某个数值，引用类型的变量是 “指向”某个对象
 * 引用类型的变量可以是空值 null
 * 要区分空值 null和空字符串 ""
 */