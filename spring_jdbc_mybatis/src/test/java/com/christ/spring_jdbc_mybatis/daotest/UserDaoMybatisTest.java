package com.christ.spring_jdbc_mybatis.daotest;

import com.christ.spring_jdbc_mybatis.dao.UserDaoMybatis;
import com.christ.spring_jdbc_mybatis.pojos.User;
import com.christ.spring_jdbc_mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

public class UserDaoMybatisTest {
    static UserDaoMybatis userDaoMybatis=null;
    static SqlSession sqlSession=null;
    Logger logger=null;
    @Before
    public void init() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        sqlSession=sqlSessionFactory.openSession();
        userDaoMybatis=sqlSession.getMapper(UserDaoMybatis.class);
        logger= LogManager.getLogger("mylog");

    }
    @Test
    public void insertuser()  {
        userDaoMybatis.insertUser(new User(0,"test","test",18,new Date()));
    }

    @Test
    public void selectOnetuser() {
        User user=userDaoMybatis.getUserById(1);
        logger.info(user);
    }
    @Test
    public void getAllTest() {
        logger.info(userDaoMybatis.getAll());
    }
    @After
    public void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
