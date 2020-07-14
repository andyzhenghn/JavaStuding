package Package05Exception;

public class JavaException {
    public static void main(String[] args) {
        /**
         * 调用方如何获知调用失败的信息
         * 方法一：约定返回错误码
         * 方法二：在语言层面上提供一个异常处理机制
         */

        // try {
        //     int code = processFile("/path1/path2");
        // } catch () {
        //
        // }
    }

    private static int processFile(String s) {
        return 0;
    }
}

/**
 * 小结：
 * java使用异常来表示错误，并通过 try...catch捕获异常
 * java的异常是 class，并且从 Throwable继承
 * Error是无需捕获的严重错误，Exception是应该捕获的可处理的错误
 * RuntimeException无需强制捕获，非 RuntimeException(Checked Exception)需强制捕获，或者用 throws声明
 * 不推荐捕获了异常但不进行任何处理
 */
