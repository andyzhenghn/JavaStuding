package Package14Multithreading;

/**
 * synchronized关键字对一个对象进行加锁
 * 它保证了代码块在任意时刻最多只有一个线程能执行
 * 如何使用：
 *  1. 找出修改共享变量的线程代码块
 *  2. 选择一个共享实例作为锁
 *  3. 使用 synchronized(lockObject) {}
 *
 *  不需要 synchronized的操作
 *  jvm规范定义了几种原子操作
 *   基本类型（long和 double除外）赋值，例如 int n = m;
 *   引用类型赋值，例如：List<String> list = anotherList;
 */

public class SyncThread {
    public static void main(String[] args) throws InterruptedException {
        AddThread add = new AddThread();
        DecThread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock) {
                Counter.count += 1;
            }
        }
    }
}

class DecThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock) {
                Counter.count -= 1;
            }
        }
    }
}

/**
 * 小结
 * 多线程同时读写共享变量时，会造成逻辑错误，因此需要通过 synchronized同步
 * 同步的本质就是给指定对象加锁，加锁后才能继续执行后续代码
 * 注意加锁对象必须是同一个实例
 * 对 jvm定义的单个原子操作不需要同步
 */
