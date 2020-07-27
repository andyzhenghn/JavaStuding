package Package14Multithreading;

import java.util.concurrent.CompletableFuture;

/**
 * CompletableFuture的优点：
 * 异步任务结束时，会自动回调某个对象的方法
 * 异步任务出错时，会自动回调某个对象的方法
 * 主线程设置好回调后，不再关心异步任务的执行
 */

public class CompletableFutureUse {
    public static void main(String[] args) throws InterruptedException {
        // 创建异步执行任务
        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(CompletableFutureUse::fetchPrice);
        // 执行成功的回调
        cf.thenAccept((result) -> {
            System.out.println("price： " + result);
        });
        // 异常的回调
        cf.exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });
        // 主线程不要立刻结束，否则 CompletableFuture默认使用的线程池会立刻关闭
        Thread.sleep(200);
    }

    static Double fetchPrice() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return 5 + Math.random() * 20;
    }
}

/**
 * 小结
 * CompletableFuture可以指定异步处理流程：
 *  thenAccept() 处理正常结果
 *  exceptional() 处理异常结果
 *  thenApplyAsync() 用于串行化另一个 CompletableFuture
 *  anyOf()和 allOf() 用于并行化多个 CompletableFuture
 */
