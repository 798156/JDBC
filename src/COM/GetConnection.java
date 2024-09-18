package COM;

import java.sql.*;

public  class GetConnection {
    public static Connection getConnection() {
        Connection  conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//驱动路径
            String url= "jdbc:mysql://localhost:3306/jdbc";      //数据库地址
            String user="root";                                //访问数据库的用户名
            String password="123456";                            //用户密码

            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //返回Connection对象
        return conn;
    }
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs!=null){
            try {
                rs.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
