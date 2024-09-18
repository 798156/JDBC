package cn.com.test;

import cn.com.dao.UserDao;
import cn.com.domain.User;

import java.util.List;

public class FINDALL {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
