package com.christ.spring_jdbc_mybatis.daotest;

import com.christ.spring_jdbc_mybatis.dao.UserDao;
import com.christ.spring_jdbc_mybatis.pojos.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class UserDaoTest {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("db/mybatis.xml");
    UserDao userDao=(UserDao) applicationContext.getBean("userDao");
    User user;
    @Test
    public void saveTest(){
        user=new User(0,"Tom","123456",20,new Date());
        userDao.save(user);
    }
    @Test
    public void updateTest(){
        user=new User(19,"Jack","1234567",21,new Date());
        userDao.update(user);
    }
    @Test
    public void deleteTest(){
        userDao.delete(19);
    }
    @Test
    public void getUserByIdTest(){
        User user=userDao.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void getAllTest(){
        System.out.println(userDao.getAll());
    }
}
