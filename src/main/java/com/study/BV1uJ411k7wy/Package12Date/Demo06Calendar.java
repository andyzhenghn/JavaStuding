package com.study.BV1uJ411k7wy.Package12Date;

import java.util.Calendar;
import java.util.Date;

public class Demo06Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        useGet(c);
        System.out.println("-----");
        useSet();
        System.out.println("-----");
        useAdd();
        System.out.println("-----");
        useGetTime();
    }

    public static void useGet(Calendar c) {
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
        int monthDate = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(monthDate);
    }

    public static void useSet() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DATE, 22);
        useGet(c);
    }

    public static void useAdd() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 1); // 正数为增加
        System.out.println(c.get(Calendar.YEAR));
        c.add(Calendar.YEAR, -3); // 负数为减少
        System.out.println(c.get(Calendar.YEAR));
    }

    public static void useGetTime() {
        // 将 Calendar转为 Date
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}