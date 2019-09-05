package com.christ.dao;

import com.christ.entities.User;
import com.christ.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

public class UserDao1 {
    @Test
    public void insertUserTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.insert("xyz.insertUser",new User("Tom","123456",18));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUserTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.delete("xyz.deleteUser",2);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void UpdateUserTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.update("xyz.updateUser",new User(4,"Tom","123456",18));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void selectOneUserTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("xyz.getUserById",1);
        System.out.println(user);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void selectUserTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> userList=sqlSession.selectList("xyz.getAll");
        System.out.println(userList);
        //sqlSession.commit();
        sqlSession.close();
    }
}
