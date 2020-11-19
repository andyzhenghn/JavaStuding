package com.study.BV1uJ411k7wy.Package10InnerClass;

/**
 * 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类
 * 当前所属方法才能使用它
 * 
 * 局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是 有效的final的
 * 从 java 8+开始，只要局部变量事实不变，那么 final关键字可以省略
 * 原因：
 * 1. new出来的对象在堆内存中
 * 2. 局部变量是跟着方法走的，在栈内存中，
 * 3. 方法运行结束之后，立刻出栈，局部变量就会立刻消失
 * 4. 但是 new出来的对象会在堆内存中持续存在，直到垃圾回收消失
 */

public class MethodClass {

    public void method() {
        int num1 = 10;
        final int num2 = 20;

        class MethodInner {
            public void methodInner() {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println("hahah");
            }
        }

        MethodInner inner = new MethodInner();
        inner.methodInner();
    }
}