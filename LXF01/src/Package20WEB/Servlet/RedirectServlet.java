package Package20WEB.Servlet;

//@WebServlet(urlPatterns="/hi")
public class RedirectServlet /** extends HttpServlet */ {
    /**
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 构造重定向的路径
        String name = req.getParameter("name");
        String redirectToUrl = "/hello" + (name == null ? "" : "?name=" + name);
        // 发送重定向响应
        resp.sendRedirect(redirectToUrl);
    }

    // 内部转发 Forward
    // 转发给另一个 Servlet处理
    protected void doGet1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/hello").forward(req, resp);
    }
     */
}

/**
 * 小结
 * 使用重定向时，浏览器知道重定向规则，并且会自动发起新的 http请求
 * 使用转发时，浏览器并不知道服务器内部的转发逻辑
 */