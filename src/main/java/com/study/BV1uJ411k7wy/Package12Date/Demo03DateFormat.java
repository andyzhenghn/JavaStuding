package com.study.BV1uJ411k7wy.Package12Date;

import java.text.SimpleDateFormat;
import java.util.Date;

// import java.text.DateFormat;

/**
 * java.text.DateFormat是日期/时间格式化子类的抽象类
 * 作用：格式化，解析
 * 成员方法：
 *  String format(Date date) 按照指定的模式，把 Date日期格式化为符合模式的字符串
 *  Date parse(String source) 把符合模式的字符串，解析为 Date日期
 * DateFormat类是一个抽象类，无法直接创建对象使用，可用子类
 * 
 * java.text.SimpleDateFormat extends Dateformat
 * 构造方法：
 *  SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造
 *  参数：String pattern:传递指定的模式
 *  模式：区分大小写
 *    y M d H m s
 */

public class Demo03DateFormat {
    public static void main(String[] args) throws Exception {
        parseDate();
        formatDate();
    }

    public static void  parseDate() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String time = "2020.07.10 00:08:42";
        Date str = sdf.parse(time);
        System.out.println(str);
    }

    public static void formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        long time = 1594310922551L;
        String str = sdf.format(time);
        System.out.println(str);
    }
}