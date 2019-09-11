package com.christ.testdao;

import com.christ.entities.Dept;
import com.christ.utils.DeptDao;
import com.christ.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DeptDaoTest {
    static DeptDao deptDao=null;
    static SqlSession sqlSession=null;
    @BeforeAll
    public static void init() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        sqlSession=sqlSessionFactory.openSession();
        deptDao=sqlSession.getMapper(DeptDao.class);

    }
    @Test
    public void insertuser()  {
        deptDao.insertDept(new Dept("develop"));
    }
   /* @Test
    public void selectOnetuser() {
        Student student=studentDao.getStudentById(1);
        System.out.println(student);
    }*/
    /*@Test
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
    }*/
    @AfterAll
    public static void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
