package Package20WEB.Servlet;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// @WebServlet(urlPatterns = "/hello")
public class HelloServlet /** extends HttpServlet */ {
    /**
     * Servlet多线程模型
     */
    private Map<String, String> map = new ConcurrentHashMap<>();

    // protected void doGet(HelloServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //     this.map.put(key, value);
    // }
}

/**
 * 小结
 * 一个 Webapp中的多个 Servlet依靠路径映射来处理不同的请求
 * 映射为 /的 Servlet可处理所有"未匹配"的请求
 * 如何处理请求取决于 Servlet覆写的对应方法
 * Web服务器通过多线程处理 HTTP请求，一个 Servlet的处理方法可以由多线程并发执行
 */
