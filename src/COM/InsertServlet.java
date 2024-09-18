//package COM;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//@WebServlet(name="InsertServlet" ,urlPatterns = "/InsertServlet")
//public class InsertServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // 1. 编码处理
//        resp.setContentType("text/html;charset=utf-8");
//        req.setCharacterEncoding("utf-8");
//
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//
//        try {
//            conn = GetConnection.getConnection();
//            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, username);
//            pstmt.setString(2, password);
//
//            int result = pstmt.executeUpdate();
//            if (result > 0) {
//                resp.getWriter().println("注册成功！");
//            } else {
//                resp.getWriter().println("注册失败！");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            resp.getWriter().println("注册失败：" + e.getMessage());
//        } finally {
//            GetConnection.close(rs, pstmt, conn);
//        }
//    }
//
//    }
//
//    @Override
//        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            this.doGet(req, resp);
//    }
//
//
//}
