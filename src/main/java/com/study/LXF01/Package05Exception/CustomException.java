package com.study.LXF01.Package05Exception;

/**
 * 在一个大型项目中，可以自定义新的异常类型
 * 需要保持一个合理的异常继承体系
 * 自定义一个 BaseException作为根异常，
 * 然后派生出各种业务类型的异常
 */

public class CustomException extends RuntimeException {
    public CustomException() {
        super();
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}

/**
 * 小结：
 * 抛出异常时，尽量复用 jdk已定义的异常类型
 * 自定义异常体系时，推荐从 RuntimeException派生出"根异常"，再派生出业务异常
 * 自定义异常时，应该提供多种构造方法
 */
