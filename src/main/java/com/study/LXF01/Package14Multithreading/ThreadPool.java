package com.study.LXF01.Package14Multithreading;

import java.util.concurrent.*;

/**
 * 把很多小任务让一组线程执行，而不是一个任务对应一个新线程
 * 这种能接受大量小任务并进行分发处理的就是线程池
 *
 * ExecutorService接口表示线程池
 * 几个常用实现类：
 *  FixedThreadPool     线程数固定的线程池
 *  CachedThreadPool    线程数根据任务动态调用的线程池
 *  SingleThreadPool    仅单线程执行的线程池
 */

public class ThreadPool {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        // 关闭线程池
        es.shutdown();
    }

    // CachedThreadPool动态线程池
    public static ExecutorService newCachedThreadPool() {
        int min = 0;
        int max = Integer.MAX_VALUE;
        return new ThreadPoolExecutor(min,
                max,
                60L,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }

    // ScheduledThreadPool 定期反复执行
    public static void newScheduledThreadPool() {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(4);
        // 提供一次性任务
        // 1秒后执行一次性任务
        ses.schedule(new Task("one-time"), 1, TimeUnit.SECONDS);
        // 2秒后开始执行定时任务，每 3秒执行
        ses.scheduleAtFixedRate(new Task("fixed-rate"), 2, 3, TimeUnit.SECONDS);
        // 2秒后开始执行定时任务，以 3秒为间隔执行
        ses.scheduleWithFixedDelay(new Task("fixed-delay"), 2, 3, TimeUnit.SECONDS);
    }
}

class Task implements Runnable {
    private final String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("end task " + name);
    }
}

/**
 * 小结
 * jdk提供了 ExecutorService实现了线程池功能
 *  线程池内部维护了一组线程，可以高效执行大量小任务
 *  Executors提供了静态方法创建不同类型的 ExecutorService
 *  必须调用 shutdown()关闭 ExecutorService
 *  ScheduleThreadPool可以定期调度多个任务
 */
