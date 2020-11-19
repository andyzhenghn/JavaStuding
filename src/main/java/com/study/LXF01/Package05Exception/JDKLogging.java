package com.study.LXF01.Package05Exception;

import java.util.logging.Logger;

/**
 * jdk的 logging定义了 7个日志级别
 * SEVERE
 * WARNING
 * INFO (默认级别，以下级别的日志不再打印出来)
 * CONFIG
 * FINE
 * FINER
 * FINEST
 * 局限性：
 *  Logging系统在 jvm启动时读取配置文件并完成初始化，一旦开始运行 main()，就无法修改配置
 *  配置不太方便，需要在 jvm启动时传递参数 -Djava.util.logging.config.file=<config-file-name>
 */

public class JDKLogging {
    public static void main(String[] args) {
        Logger l = Logger.getGlobal();
        l.severe("process will be terminated");
        l.warning("memory id running out...");
        l.info("start process...");
        l.fine("ignored.");
    }
}

/**
 * 小结：
 * 日志是为了替代 System.out.println()，可以定义格式，重定向到文件等
 * 日志可以存档，便于追踪问题
 * 日志记录可以按级别分类，便于打开或关闭某些级别
 * 可以根据配置文件调整日志，无需修改代码
 * java标准库提供了 java.util.logging来实现日志功能
 */
