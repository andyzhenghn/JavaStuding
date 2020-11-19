package com.study.LXF01.Package05Exception;

/**
 * Log4j自动通过不同的 Appender把同一条日志输出到不同的目的地
 * console -> 输出到屏幕
 * file    -> 输出到文件
 * socket  -> 通过网络输出到远程计算机
 * jdbc    -> 输出到数据库
 */

public class Log4jUse {
    public static void main(String[] args) {

    }
}

/**
 * 小结：
 * 通过 Commons Logging实现日志，不需要修改代码即可使用 Log4j
 * 使用 Log4j只需要把 log4j2.xml和相关 jar放入 classpath
 * 如果要更换 Log4j，只需要移除 log4j2.xml和相关 jar
 * 只有扩展 Log4j时，才需要引用 Log4j的接口
 */
