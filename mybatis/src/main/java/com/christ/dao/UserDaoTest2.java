package com.christ.dao;

import com.christ.entities.User;
import com.christ.utils.MybatisUtil;
import com.christ.utils.UserDao2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class UserDaoTest2 {
    static UserDao2 userDao=null;
    static SqlSession sqlSession=null;
    @BeforeAll
    public static void init() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        sqlSession=sqlSessionFactory.openSession();
        userDao=sqlSession.getMapper(UserDao2.class);

    }
    @Test
    public void insertuser()  {
        userDao.insertUser(new User("Jack1","654321",24,new Date()));
    }
    @Test
    public void selectOnetuser() {
        User user=userDao.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void deleteuser() {
        userDao.deleteUser(6);
    }
    @Test
    public void updateuser() {
        userDao.updateUser(new User(7,"Jack1","654321",24));
    }
    @Test
    public void selectalluser() {
        List<User> users=userDao.getAll();
        System.out.println(users);
    }
    @AfterAll
    public static void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
