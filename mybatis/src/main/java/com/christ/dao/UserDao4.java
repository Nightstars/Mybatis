package com.christ.dao;

import com.christ.entities.User;
import com.christ.utils.MybatisUtil;
import com.christ.utils.UserDao2;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class UserDao4 {
    static UserDao41 userDao=null;
    static SqlSession sqlSession=null;
    @BeforeAll
    public static void init() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        sqlSession=sqlSessionFactory.openSession();
        userDao=sqlSession.getMapper(UserDao41.class);
    }
    @Test
    public void getallTest(){
        //System.out.println(users);
        Page<User> page= PageHelper.startPage(1,10);
        List<User> users=userDao.getAll();
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getPageNum());
        List<User> users1=page.getResult();
        System.out.println(users1);
    }

    @AfterAll
    public static void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
