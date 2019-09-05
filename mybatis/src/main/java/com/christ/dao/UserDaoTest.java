package com.christ.dao;

import com.christ.utils.MybatisUtil;
import com.christ.utils.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class UserDaoTest {
    @Test
    public void insertuser() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
    }
}
