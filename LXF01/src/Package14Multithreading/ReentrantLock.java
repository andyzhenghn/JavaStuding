package Package14Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class ReentrantLock {
    private final Lock lock = (Lock) new ReentrantLock();
    private int count;

    public void add(int n) throws InterruptedException {
        if (lock.tryLock(1, TimeUnit.SECONDS)) {

        }
        /**
            lock.lock();
            try {
                count += n;
            } finally {
                lock.unlock();
            }
         */
    }
}

/**
 * 小结
 * ReentrantLock可以替代 synchronized进行同步
 * ReentrantLock获取锁更安全
 * 必须先获取到锁，再进入 try {}代码块，最后使用 finally保证释放锁
 * 可以使用 tryLock()尝试获取锁
 */
