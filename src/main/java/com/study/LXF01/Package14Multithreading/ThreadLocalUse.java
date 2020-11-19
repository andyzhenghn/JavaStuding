package com.study.LXF01.Package14Multithreading;

/**
 * 在一个线程中，横跨若干方法调用，需要传递的对象，通常称为上下文（Context）
 */

public class ThreadLocalUse {
    static ThreadLocal<Object> threadLocalUser = new ThreadLocal<>();

    void processUser(Object o) {
        try {
            threadLocalUser.set(o);
            step1();
            step2();
        } finally {
            threadLocalUser.remove();
        }
    }

    void step1() {
        Object o = threadLocalUser.get();
        log();
    }

    void log() {
        Object o = threadLocalUser.get();
        System.out.println(o);
    }

    void step2() {
        Object o = threadLocalUser.get();
    }
}

/**
 * 小结
 * ThreadLocal表示线程的"局部变量"，它确保每个线程的 ThreadLocal变量都是各自独立的
 * ThreadLocal适合在一个线程的处理流程中保持上下文（避免了同一参数在所有方法中传递）
 * 使用 ThreadLocal要用 try...finally结构，并在 finally中清除
 */
