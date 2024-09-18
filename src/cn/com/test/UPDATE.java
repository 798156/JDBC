package cn.com.test;

import cn.com.dao.UserDao;
import cn.com.domain.User;

import java.util.Date;

public class UPDATE {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(1);
        user.setName("世界");
        user.setEmail("zhangsan@163.com");
        user.setPassword("123456");
        user.setBirthday(new Date());
        Boolean update=userDao.update(user);
        if (update)
            System.out.println("修改成功");
        else
            System.out.println("修改失败！");
    }
}
