package com.study.LXF01.Package14Multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Condition {
    private final Lock lock = (Lock) new ReentrantLock();
    private final Condition condition = (Condition) lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void addTask(String s) {
        lock.lock();
        try {
            queue.add(s);
            // signal()会唤醒某个等待线程
            // condition.signal();
            // signalAll()会唤醒所有等待线程
            // condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String getTask() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                // await()会释放当前锁，进入等待状态
                // 唤醒线程从 await()返回后需要重新获得锁
                // condition.await();
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }
}

/**
 * 小结
 * Condition可以替代 wait和 notify
 * Condition对象必须从 Lock对象获取
 */
