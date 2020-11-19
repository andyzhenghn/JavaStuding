package com.study.LXF01.Package14Multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * java.util.concurrent包提供了底层锁、并发集合
 * java.util.concurrent.atomic包中，提供了一组原子操作的封装类
 * Atomic类是通过无锁（lock-free）的方式实现的线程安全（thread-safe）访问，主要原理是CAS(Compare and Set)
 */

public class Atomic {

    public int incrementAndSet(AtomicInteger var) {
        int prev, next;
        do {
            prev = var.get();
            next = prev + 1;
        } while (!var.compareAndSet(prev, next));
        return next;
    }

}

/**
 * 多线程安全的全局唯一 ID生成器
 */
class IdGenerator {
    AtomicLong var = new AtomicLong(0);

    public long getNextId() {
        return var.incrementAndGet();
    }
}

/**
 * 小结
 * 使用 atomic提供的原子操作可以简化多线程编程
 *  原子操作实现了无锁的线程安全
 *  适用于计数器，累加器等
 */
