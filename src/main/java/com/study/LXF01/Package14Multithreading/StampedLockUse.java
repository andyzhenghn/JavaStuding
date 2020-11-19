package com.study.LXF01.Package14Multithreading;

import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock的不同：
 *  读的过程中也允许获取写锁后写入
 * 乐观锁：乐观地估计读的过程中大概率不会有写，并发效率更高
 * 悲观锁：读的过程中拒绝有写入，也就是写入必须等待
 */

public class StampedLockUse {
    private final StampedLock stampedLock = new StampedLock();
    private double x;
    private double y;

    public void move(double deltaX, double deltaY) {
        // 获取读锁
        long stamp = stampedLock.writeLock();
        try {
            x += deltaX;
            y += deltaY;
        } finally {
            // 释放写锁
            stampedLock.unlockWrite(stamp);
        }
    }

    public double distanceFromOrigin() {
        // 获得一个乐观读锁
        long stamp = stampedLock.tryOptimisticRead();
        double currentX = x;
        double currentY = y;
        // 检查乐观读锁后是否有其他写锁发生
        if (!stampedLock.validate(stamp)) {
            // 获取一个悲观读锁
            stamp = stampedLock.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                // 释放悲观读锁
                stampedLock.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }
}

/**
 * 小结
 * StampedLock提供了乐观锁，可取代 ReadWriteLock以进一步提升并发性能
 * StampedLock是不可重入锁
 */
