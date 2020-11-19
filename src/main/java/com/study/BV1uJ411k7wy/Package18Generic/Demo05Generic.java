package com.study.BV1uJ411k7wy.Package18Generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型的上限限定： ? extends E 代表使用的泛型只能是 E类型的子类/本身
 * 泛型的下限限定： ? super E   代表使用的泛型只能是 E类型的父类/本身
 */

public class Demo05Generic {
    public static void main(String[] args) {
        Collection<Integer> l1 = new ArrayList<Integer>();
        Collection<String> l2 = new ArrayList<String>();
        Collection<Number> l3 = new ArrayList<Number>();
        Collection<Object> l4 = new ArrayList<Object>();

        extendsMethod((ArrayList<? extends Number>) l1);
        // extendsMethod(l2);
        extendsMethod((ArrayList<? extends Number>) l3);
        // extendsMethod(l4);

        // superMethod(l1);
        // superMethod(l2);
        superMethod((ArrayList<? super Number>) l3);
        superMethod((ArrayList<? super Number>) l4);
    }

    public static void extendsMethod(ArrayList<? extends Number> coll) {
    }

    public static void superMethod(ArrayList<? super Number> coll) {
    }
}
