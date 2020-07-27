package Package14Multithreading;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 使用 ReadWriteLock可以解决：
 *  只允许一个线程写入（其他线程既不能写入也不能读取）
 *  没有写入时，多个线程同时读（提高性能）
 * 适用：
 *  同一个数据，有大量线程读取，但仅有少数线程修改
 */

public class ReentrantReadWriteLockUse {
    private final ReadWriteLock rwlock = new ReentrantReadWriteLock();
    private final Lock rlock = rwlock.readLock();
    private final Lock wlock = rwlock.writeLock();
    private int[] counts = new int[10];

    public void inc(int index) {
        wlock.lock();   // 加写锁
        try {
            counts[index] += 1;
        } finally {
            wlock.unlock(); // 释放写锁
        }
    }

    public int[] get() {
        rlock.lock();   // 加读锁
        try {
            return Arrays.copyOf(counts, counts.length);
        } finally {
            rlock.unlock(); // 释放读锁
        }
    }
}

/**
 * 小结
 * 适用 ReadWriteLock可以提高读取效率
 *  ReadWriteLock只允许一个线程写入
 *  ReadWriteLock允许多个线程在没有写入时同时读取
 *  ReadWriteLock适合读多写少的场景
 */
