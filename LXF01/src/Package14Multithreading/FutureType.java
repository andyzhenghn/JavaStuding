package Package14Multithreading;

import java.util.concurrent.*;

/**
 * Runnable接口没有返回值
 * Callable接口有返回值，是个泛型接口，可以返回指定类型的结果
 *
 * 一个 Future<V>接口表示一个未来可能会返回的结果，它定义的方法有：
 *  get()       获取结果（可能会等待）
 *  get(long timeout, TimeUnit unit) 获取结果，但只等待指定的时间
 *  cancel(boolean mayInterruptionIfRunning) 取消当前任务
 *  isDone() 判断任务是否已完成
 */

public class FutureType {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Callable<String> task = new TaskCallable();
        Future<String> future = executor.submit(task);
        String result = future.get();
    }
}

class TaskCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return longTimeCalculation();
    }

    private String longTimeCalculation() {
        return "sss";
    }
}

/**
 * 小结
 * 对线程池提交一个 Callable任务，可以获得一个Future对象
 * 可以用 Future在将来某个时刻获取结果
 */
