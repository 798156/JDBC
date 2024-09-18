package cn.com.test;

import cn.com.dao.UserDao;
import cn.com.domain.User;

public class FIND {
    public static void main(String[] args) {
//
        UserDao userDao = new UserDao();
        User user = userDao.find(55);
        System.out.println(user);
        //User{id=5, name='hl', password='123', email='hl@sina.com', birthday=2024-08-03}User{id=5, name='hl', password='123', email='hl@sina.com', birthday=2024-08-03}
    }
}
