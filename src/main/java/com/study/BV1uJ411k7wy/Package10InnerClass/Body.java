package com.study.BV1uJ411k7wy.Package10InnerClass;

/**
 * 分类：
 * 1. 成员内部类
 * 2. 局部内部类（包含匿名内部类）
 * 
 * 注意：
 *  内用外，随意访问，外用内，需要内部类对象
 */

public class Body { // 外部类

    public class Heart { // 内部类

        // 内部类的方法
        public void beat() {
            System.out.println("跳动");
            // 内部类访问外部类的变量
            System.err.println("name: " + name);
        }

    }

    private String name = "haha";

    // 外部类的方法
    public void exercise() {
        Heart heart = new Heart();
        System.out.println("运动");
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}