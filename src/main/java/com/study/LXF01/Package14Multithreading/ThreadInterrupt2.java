package com.study.LXF01.Package14Multithreading;

/**
 * volatile关键字的目的：
 *  每次访问变量时，总是获取主内存的最新值
 *  每次修改变量后，立刻回写到主内存
 * volatile关键字解决的是可见性问题：
 *  当一个线程修改了某个共享变量的值，其他线程能够立刻看到修改后的值
 *
 * 在 x86架构下，jvm回写主内存的速度非常快
 * 在 arm架构，就会有显著的延迟
 */

public class ThreadInterrupt2 {
    public static void main(String[] args) throws InterruptedException {
        HelloThread2 t = new HelloThread2();
        t.start();
        Thread.sleep(1);
        t.running = false;
    }
}

class HelloThread2 extends Thread {
    public volatile boolean running = true;

    @Override
    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + "hello!");
        }
        System.out.println("end!");
    }
}

/**
 * 小结
 * 对目标线程调用 interrupt()方法可以请求中断一个线程，目标线程通过检测 isInterrupt()标志获取自身是否已中断。
 * 如果目标线程处于等待状态，该线程会捕获到 InterruptedException
 * 目标线程检测到 isInterrupted()为 true或者捕获了 InterruptedException都应该立刻结束自身线程
 * 通过标志位判断需要正确使用 volatile关键字
 * volatile关键字解决了共享变量在线程间的可见性问题
 */
