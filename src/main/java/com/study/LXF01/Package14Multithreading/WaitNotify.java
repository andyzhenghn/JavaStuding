package com.study.LXF01.Package14Multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        TaskQueueClass q = new TaskQueueClass();
        ArrayList<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            String s = q.getTask();
                            System.out.println("execute task: " + s);
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                }
            };
            t.start();
            // t.add(t);
        }

        Thread add = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String s = "t-" + Math.random();
                System.out.println("add task: " + s);
                q.addTask(s);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
        for (Thread t : ts) {
            t.interrupt();
        }
    }
}

class TaskQueueClass {
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
        // 唤醒在 this锁等待的线程
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException {
        while (queue.isEmpty()) {
            // 释放锁
            this.wait();
            // 重新获得锁
        }
        return queue.remove();
    }
}

/**
 * 小结
 * wait和 notify用于多线程协调运行
 *  在 synchronized内部可以调用 wait()使线程进入等待状态
 *  必须在已获得的锁对象上调用 wait()方法
 *  在 synchronized内部可以调用 notify()或 notifyAll()唤醒其他等待线程
 *  必须在已获得的锁对象上调用 notify()或 notifyAll()方法
 *  已唤醒的线程还需要重新获得锁后才能继续执行
 */