package com.christ.service;

import com.christ.pojos.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
            ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
            UserService userService=applicationContext.getBean(UserService.class);
            System.out.println(userService);
            List<User> userList=userService.getAll();
            System.out.println(userList);
    }
}
