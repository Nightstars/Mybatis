package com.christ.testdao;

import com.christ.entities.Student;
import com.christ.entities.User;
import com.christ.utils.MybatisUtil;
import com.christ.utils.StudnetDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class StudentDaoTest {
    static StudnetDao studentDao=null;
    static SqlSession sqlSession=null;
    @BeforeAll
    public static void init() throws IOException {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getSqlSessionFactory();
        sqlSession=sqlSessionFactory.openSession();
        studentDao=sqlSession.getMapper(StudnetDao.class);

    }
    @Test
    public void insertuser()  {
        studentDao.insertStudent(new Student("Jack1",20190906,new Date(),80));
    }
    @Test
    public void selectOnetuser() {
        Student student=studentDao.getStudentById(1);
        System.out.println(student);
    }
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
