package Package05Exception;

public class ThrowsException {
    public static void main(String[] args) throws Exception {
        /**
         * 抛出异常
         * 1. 创建某个 Exception的实例
         * 2. 用 throw语句抛出
         */

        /**
         * 异常屏蔽
         * 如果在执行 finally语句时抛出异常，原来在 catch中准备抛出的异常就消失了，因为只能抛出一个异常
         * 没有被抛出的异常被称为 被屏蔽的异常（Suppressed Exception）
         * 解决：
         * 先用 origin变量保存原始异常，然后在抛出
         */
        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }

    }

//    private void process(String s) {
//        if (s == null) {
//            // NullPointerException e = new NullPointerException();
//            // throw e;
//            throw new NullPointerException();
//        }
//    }

//    private void process1(String s) {
//        try {
//            process("i");
//        } catch (NullPointerException e) {
//            // 拿到原始异常信息，在构造异常时，把原始的 Exception实例传进去
//            throw new IllegalArgumentException(e);
//        }
//    }
}

/**
 * 小结：
 * 调用 printStackTree()可以打印异常的传播栈，对于调试非常有用
 * 捕获异常并再次抛出新的异常时，应该持有原始异常信息
 * 通过不要在 finally中抛出异常。如果在 finally中抛出异常，应该原始异常加入到原有异常中。调用放可通过 Throwable.getSuppressed()获取所有添加的 Suppressed Exception
 */
