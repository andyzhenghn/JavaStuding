package Package05Exception;

public class NullPointerException {
    private String name = "";

    public static void main(String[] args) {
        /**
         * NullPointerException是一种代码逻辑错误
         * 严禁使用 catch来隐藏这种编码错误
         * 成员变量在定义时初始化
         */
    }
}

/**
 * 小结：
 * NullPointerException是 java代码常见的逻辑错误，应当早暴露，早修复
 * 可以启用 java 14的增强异常信息来查看 NullPointerException的详细错误信息
 */
