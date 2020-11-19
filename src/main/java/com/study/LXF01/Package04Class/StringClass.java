package com.study.LXF01.Package04Class;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});

        /**
         * 比较字符串
         * equals() 比较字符串的内容是否相同
         * equalsIgnoreCase() 忽略大小写用
         */
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println(b1);
        System.out.println(b2);

        /**
         * 搜索子串
         * contains() 是否包含某些子串
         * indexOf()
         * lastIndexOf()
         * startsWith()
         * endsWith()
         */
        boolean b3 = s1.contains("he");
        int b4 = s1.indexOf("l");
        int b5 = s1.lastIndexOf("e");
        boolean b6 = s1.startsWith("He");
        boolean b7 = s1.endsWith("lo");
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);

        /**
         * 提取子串
         * substring(startIndex, [endIndex]);
         */
        String str1 = s1.substring(1);
        String str2 = s1.substring(1, 4);
        System.out.println(str1);
        System.out.println(str2);

        /**
         * 去除首尾空白字符
         * 空白字符包括空格，\t，\r，\n
         * trim()
         * strip() 移除字符串首尾空白字符，中文空格字符也会被移除
         * stripLeading()
         * stripTrailing()
         */
        String str3 = ("\u3000HELLO\u3000").trim();
        // String str4 = ("\u3000HELLO\u3000").strip();
        System.out.println(str3);

        /**
         * isEmpty() 字符串是否为空
         * isBlank() 是否为空白字符串
         */
        boolean b8 = " ".isEmpty();
        // boolean b9 = " ".isBlank();
        System.out.println(b8);

        /**
         * 替换子串
         * replace(String, String)
         * replaceAll(Exp, String) 通过正则表达式进行替换
         */
        String newS1 = s1.replace("he", "hahaha");
        System.out.println(newS1);
        String s3 = "A,,B;C ,D";
        String newS3 = s3.replaceAll("[\\,\\;\\s]+", ",");
        System.out.println(newS3);

        /**
         * 分割字符串
         * split() 传入的参数是正则表达式
         */
        String[] s3Arr = newS3.split("\\,");
        System.out.println(Arrays.toString(s3Arr));

        /**
         * 拼接字符串
         * String.join()
         */
        String s3Arr2Str = String.join("***", s3Arr);
        System.out.println(s3Arr2Str);

        /**
         * 格式化字符串
         * formatted()
         * String.format()
         * 常用占位符：
         * %s 显示字符串
         * %d 显示整数
         * %x 显示十六进制整数
         * %f 显示浮点数
         */
        String s4 = "Hi %s, your score is %d!";
        // System.out.println(s4.formatted("haha", 80));
        System.out.println(String.format(s4, "haha", 80));

        /**
         * 类型转换
         * 任意基本类型或引用类型转换为字符串，可以用静态方法 valueOf()
         */
        String.valueOf(124);
        String.valueOf(45.67);
        String.valueOf(true);
        String.valueOf(new Object());

        // 字符串转 int
        int n1 = Integer.parseInt("123");
        int n2 = Integer.parseInt("ff", 16);
        // 字符串转 boolean
        boolean b10 = Boolean.parseBoolean("true");
        boolean b11 = Boolean.parseBoolean("FALSE");
        // 将该字符串对应的系统变量转换为 integer
        Integer.getInteger("java.version");
        // String和 char相互转换
        char[] chars = s1.toCharArray();
        String s = new String(chars);
    }
}

/**
 * 小结：
 * java字符串 String是不可变对象
 * 字符串操作不改变原字符串内容，而是返回新字符串
 * 常用的字符串操作：提取子串、查找、替换、大小写转换等
 * java使用 Unicode编码表示 String和 char
 * 转换编码就是将 String和 byte[]转换，需要指定编码
 * 转换为 byte[]，始终优先考虑 UTF-8编码
 */
