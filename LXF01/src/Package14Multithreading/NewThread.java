package Package14Multithreading;

public class NewThread {
    public static void main(String[] args) {
        new1();
        new2();
        new3();
        // 对线程设定优先级，int n 为 1 - 10，默认值为 5
        // Thread.setPriority(3);
    }

    public static void new1() {
        Thread t = new Thread();
        t.start(); // 启动新线程
    }

    // 方法一：从 Thread派生一个自定义类，然后覆写 run()方法
    public static void new2() {
        Thread t = new MyThread();
        t.start();
    }

    // 方法二：创建 Thread实例时，传入一个 Runnable实例
    public static void new3() {
        Thread t = new Thread(new MyRunnable());
        t.start();

        try {
            // 单位为 毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        // lambda语法进行简写
        Thread th = new Thread(() -> {
            System.out.println("start new thread2");
        });
        th.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread1");
    }
}

/**
 * 小结
 * java用 Thread对象表示一个线程，通过调用 start()启动一个新线程
 * 一个线程对象只能调用一次 start()方法
 * 线程的执行代码写在 run()方法中
 * 线程调度由操作系统决定，程序本身无法决定调度顺序
 * Thread.sleep()可以把当前线程暂停一段时间
 */
