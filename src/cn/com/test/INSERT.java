package cn.com.test;

import cn.com.dao.UserDao;
import cn.com.domain.User;

import java.util.Date;

public class INSERT {
    public static void main(String[] args) {
        // 向users表插入一个用户信息
        UserDao usersDao = new UserDao();
        User user = new User();
        user.setId(1);
        user.setName("世界");
        user.setPassword("123");
        user.setEmail("hl@sina.com");
        user.setBirthday(new Date());
        Boolean insert = usersDao.insert(user);
        if (insert) {
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败!");
        }
    }
}
