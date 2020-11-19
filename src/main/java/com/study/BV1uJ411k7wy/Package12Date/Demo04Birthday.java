package com.study.BV1uJ411k7wy.Package12Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04Birthday {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入出生日期，格式为 yyyy-MM-dd");
        String birth = scan.next();
        scan.close();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateInput = sdf.parse(birth);
        long start = dateInput.getTime();
        long now = new Date().getTime();
        long difference = now - start;
        System.out.println(difference / 1000 / 60 / 60 / 24);
    }
}