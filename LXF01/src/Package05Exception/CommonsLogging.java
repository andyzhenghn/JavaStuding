package Package05Exception;

/**
 * 第三方日志库
 * 默认会搜索并使用 Log4j
 * 没有找到则使用 jdk logging
 * 6个日志级别：
 * FATAL
 * ERROR
 * WARNING
 * INFO (默认级别)
 * DEBUG
 * TRACE
 */

public class CommonsLogging {
    public static void main(String[] args) {
        // Log log = LogFactory.getLog(Main.class);
        // log.info("start...");
        // log.warn("end.");
    }

    // 在静态方法中使用
    // static final Log log = LogFactory.getLog(Main.class);
    // static void foo() {
    //    log.info("foo");
    // }

    // 在实例方法中引用
    // protected final Log log = LogFactory.getLog(getClass());
    // void foo() {
    //     log.info("foo");
    // }

    // info(String, Throwable)
    // public void test() {
    //     try {
    //
    //     } catch (Exception e) {
    //         log.error("get exception!", e);
    //     }
    // }
}

/**
 * 小结：
 * Commons Logging是使用最广泛的日志模块
 * Commons Logging的 API非常简单
 * Commons Logging可以自动检测并使用其他日志模块
 */
