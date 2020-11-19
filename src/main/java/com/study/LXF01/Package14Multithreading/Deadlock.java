package com.study.LXF01.Package14Multithreading;

public class Deadlock {
    /**
    public void add(int m) {
        synchronized(lockA) { // 获得lockA的锁
            this.value += m;
            synchronized(lockB) { // 获得lockB的锁
                this.another += m;
            } // 释放lockB的锁
        } // 释放lockA的锁
    }

    public void dec(int m) {
        synchronized(lockB) { // 获得lockB的锁
            this.another -= m;
            synchronized(lockA) { // 获得lockA的锁
                this.value -= m;
            } // 释放lockA的锁
        } // 释放lockB的锁
    }
     */
}

/**
 * 小结
 * java的 synchronized锁是可重入锁
 * 死锁产生的条件是多线程各自持有不同的锁，并互相试图获取对方已持有的锁，导致无限等待
 * 避免死锁的方法是多线程获取锁的顺序要一致
 */
