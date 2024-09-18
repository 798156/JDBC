package COM;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet" ,urlPatterns = "/LoginServlet")
public  class  LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.编码处理
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");

        //2.接收参数 username password
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sql = "select password from users where username=?";

        //3.和数据库建立连接, 查询,比较
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean loginSuccess = false;

        try {
            conn = GetConnection.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username); // 使用setString而不是setObject，因为你知道这是字符串类型
            rs = ps.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");
                if (password.equals(storedPassword)) {
                    loginSuccess = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            GetConnection.close(rs, ps, conn); // 关闭资源
        }

        //4.判断结果，给出响应
        if (loginSuccess) {
            // 登录成功，重定向到success.jsp页面
            resp.sendRedirect(req.getContextPath() + "/success.jsp");
        } else {
            // 登录失败，返回错误信息
            resp.getWriter().print("用户名或密码错误");
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
