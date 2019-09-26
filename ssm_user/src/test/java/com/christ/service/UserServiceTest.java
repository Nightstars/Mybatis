package com.christ.service;

import com.christ.dao.UserDao;
import com.christ.pojos.User;
import com.github.pagehelper.Page;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/applicationContext.xml")
@Data
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void saveTest(){
        userService.save(new User(0,"test","123456",20,new Date()));
    }
    @Test
    public void getAllTest(){
        List<User> userList=userService.getAll();
        System.out.println(userList );
    }
    @Test
    public void getPage(){
        Page<User> page=userService.getPage(2,6);
        System.out.println(page.getTotal() );
        System.out.println(page.getPages() );
        List<User> users=page.getResult();
        for(User user:users){
            System.out.println(user);
        }
    }
}
