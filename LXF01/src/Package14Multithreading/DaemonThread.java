package Package14Multithreading;

/**
 * 守护线程（Daemon Thread）
 *  指为其他线程服务的线程，在 jvm中，所有非守护线程都执行完毕后，无论有没有守护线程，虚拟机都会自动退出
 * 守护线程不能持有任何需要关闭的资源，例如打开文件等，因为虚拟机退出时，守护线程没有任何机会来关闭文件，这会导致数据丢失
 */

public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setDaemon(true);
        t.start();
    }
}

/**
 * 小结
 * 守护线程是为其他线程服务的线程
 * 所有非守护线程都执行完毕后，虚拟机退出
 * 守护线程不能持有需要关闭的资源
 */
