package cn.com;

import java.sql.*;
//打印所有
public class Example01 {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            // 1. 注册数据库的驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.通过DriverManager获取数据库连接
            String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT%2B8";
            String username = "root";//数据库名称
            String password = "123456";//数据库密码
            conn = DriverManager.getConnection (url, username,password);
            // 3.通过Connection对象获取Statement对象
            stmt = conn.createStatement();
            // 4.使用Statement执行SQL语句
            String sql = "select * from users";
            rs = stmt.executeQuery(sql);
            // 5. 操作ResultSet结果集
            System.out.println("id | name |email ");
            while (rs.next()) {
                int id = rs.getInt("id"); // 通过列名获取指定字段的值
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " | " + name + " | " + email);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            // 6.回收数据库资源
            if(rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}
