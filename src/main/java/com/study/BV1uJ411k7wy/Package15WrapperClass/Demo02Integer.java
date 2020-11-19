package com.study.BV1uJ411k7wy.Package15WrapperClass;

import java.util.ArrayList;

/**
 * 自动装箱和自动拆箱
 *  基本类型的数据和包装类之间可以自动的相互装换
 *  JDK1.5之后出现的新属性
 */

public class Demo02Integer {
    public static void main(String[] args) {
        /**
         * 自动装箱：直接把 int类型的整数赋值给包装类
         */
        Integer in = 1;
        // 相当于
        // Integer in = new Integer(1);

        /**
         * 自动拆箱：in是包装类，无法直接参与运算，可以把自动装换为基本类型的数据，再参与计算
         * in + 2 相当于 in.intValue() + 3 = 3;
         * in = in + 2 相当于 in = new Integer(3) 自动装箱
         */
        in = in + 2;
        System.out.println(in);

        // ArrayLis集合无法直接存储整数，可以存储 Integer包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
    }
}