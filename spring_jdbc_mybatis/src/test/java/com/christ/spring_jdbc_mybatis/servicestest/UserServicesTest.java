package com.christ.spring_jdbc_mybatis.servicestest;

import com.christ.spring_jdbc_mybatis.pojos.User;
import com.christ.spring_jdbc_mybatis.services.UserService;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/db/applicationContext.xml")
@Data
public class UserServicesTest {
    @Autowired
    UserService userService;
    @Test
    public void saveTest() throws Exception {
        userService.save(new User(0,"rollbacktest","123456",20,new Date()));
    }
}
