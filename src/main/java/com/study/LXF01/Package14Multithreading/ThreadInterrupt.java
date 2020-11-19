package com.study.LXF01.Package14Multithreading;

/**
 * 中断一个程序：
 * 只需要在其他线程中对目标线程调用 interrupt()方法，目标线程需要反复检测自身状态是否是 interrupted状态，如果是，就立刻执行
 */

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread1();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThread1 extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + "hello");
        }
    }
}
