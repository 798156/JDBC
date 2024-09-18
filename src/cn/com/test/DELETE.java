package cn.com.test;

import cn.com.dao.UserDao;

public class DELETE {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        Boolean delete=userDao.delete(1);
        if (delete)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");

    }
}
