package com.christ.spring_jdbc_mybatis.daotest;

import com.christ.spring_jdbc_mybatis.dao.UserDaoMybatis;
import com.christ.spring_jdbc_mybatis.pojos.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/db/applicationContext.xml")
public class UserDaoMybatisTest1 {
    @Autowired
    UserDaoMybatis userDaoMybatis;
    Logger logger= LogManager.getLogger("mylog");
    public void setUserDaoMybatis(UserDaoMybatis userDaoMybatis) {
        this.userDaoMybatis = userDaoMybatis;
    }
    @Test
    public void insertuser()  {
        userDaoMybatis.insertUser(new User(0,"test1","test1",20,new Date()));
    }

    @Test
    public void selectUserById() {
        User user=userDaoMybatis.getUserById(1);
        logger.info(user);
    }
    @Test
    public void getAllTest() {
        logger.info(userDaoMybatis.getAll());
    }
}
