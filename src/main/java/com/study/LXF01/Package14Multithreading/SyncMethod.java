package com.study.LXF01.Package14Multithreading;

public class SyncMethod {
    private int count = 0;

    public void add(int n) {
        synchronized (this) {
            count += n;
        }
    }

    public void dec(int n) {
        synchronized (this) {
            count -= n;
        }
    }

    public int get() {
        return count;
    }
}

/**
 * 小结
 * 用 synchronized修饰方法可以把整个方法变为同步代码块，synchronized方法加锁对象是 this
 * 通过合理的设计和数据封装可以把一个类变为"线程安全"
 * 一个类没有特殊说明，默认不是 thread-safe
 * 多线程能否安全访问某个非线程安全的实例，需要具体问题具体分析
 */