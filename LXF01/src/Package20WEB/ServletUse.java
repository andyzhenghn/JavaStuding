package Package20WEB;

// WebServlet注解表示这是一个 Servlet，并映射到地址 /
//@WebServlet(urlPatterns = "/")
public class ServletUse /** extends HttpServlet */ {
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // 设置响应类型：
//        resp.setContentType("text/html");
//        // 获取输出流：
//        PrintWriter pw = resp.getWriter();
//        // 写入响应：
//        pw.write("<h1>Hello, world!</h1>");
//        // 最后不要忘记 flush强制输出
//        pw.flush();
//    }
}

/**
 * 无法直接运行 war文件，必须先启动 web服务器，再由服务器加载编写的 servlet，这样就可以处理浏览器发送的请求
 *
 * 常用的服务器：
 *  Tomcat
 *  Jetty
 *  GlassFish
 *  WebLogic
 *  WebSphere
 *
 * 在 Servlet容器中运行的 Servlet的特点：
 *  无法在代码中直接通过 new创建 Servlet实例，必须由 Servlet容器自动创建 Servlet实例
 *  Servlet容器只会给每个 Servlet类创建唯一实例
 *  Servlet容器会使用多线程执行 doGet()或 doPost()方法
 *
 * 在 Servlet中定义的实例变量会被多个线程同时访问，注意线程安全
 * HttpServletRequest和 HttpServletResponse实例是由 Servlet容器传入的局部变量，它们只会被当前线程访问，不存在多个线程访问的问题
 * 在 doGet()和 doPost()方法中，如果使用了 ThreadLocal，但没有清理，那么它的状态很可能会影响到下次的某个请求，因为 Servlet容器很可能会用线程池实现线程复用
 *
 * 小结
 * 编写 Web应用程序就是编写 Servlet处理 HTTP请求
 * Servlet API提供了 HttpServletRequest和 HttpServletResponse两个高级接口来封装 HTTP请求和响应
 * Web应用程序必须按固定结构组织并打包为 .war文件
 * 需要启动 Web服务器来加载我们的 war包来运行 Servlet
 */
