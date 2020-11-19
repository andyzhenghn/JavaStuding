package com.study.BV1uJ411k7wy.Package09Final;

/**
 * 四种权限修饰符
 *                  public > protected > [default] > private
 * 同一个类             yes     yes         yes         yes
 * 同一个目录           yes     yes          yes         no
 * 不同目录的子类        yes     yes         no           no
 * 不同目录的非子类      yes      no          no          no
 * 
 * 注意：
 * [default] 不是关键字 default，是什么都不写
 */

public class PermissionModifier {
    void method() {
        System.out.println("default method");
    }
}