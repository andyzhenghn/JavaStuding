package Package05Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        /**
         * 多 catch语句
         * 每个 catch分别捕获对应的 Exception及其子类
         * 子类必须写在前面
         */
        try {

        } catch (UnsupportedOperationException e) {
            System.out.println("Bad encoding");
        }
        // catch (IOException e) {
        //     System.out.println("IO error");
        // }

        /**
         * finally语句
         * finally语句块保证有无错误都会执行
         * 不是必须的，可写可不写
         * 总是最后执行
         */
        try {

        } catch (UnsupportedOperationException e) {

        }
        // catch (IOException e) {

        // }
        finally {

        }

        /**
         * 捕获多种异常
         * 某些异常的处理逻辑相同，但是异常本身不存在继承关系，可以使用 | 合并到一起
         */
        try {

        } catch (/* IOException | */ NumberFormatException e) {
            System.out.println("Bad input");
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}

/**
 * 小结：
 * 使用 try...catch...finally
 * 多个 catch语句的匹配顺序非常重要，子类必须放在前面
 * finally语句保证了有无异常都会执行，是可选的
 * 一个 catch语句也可以匹配多个非继承关系的异常
 */
