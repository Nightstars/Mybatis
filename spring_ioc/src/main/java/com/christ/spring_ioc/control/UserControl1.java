package com.christ.spring_ioc.control;

import com.christ.spring_ioc.pojos.User1;
import com.christ.spring_ioc.services.UserService;
import com.christ.spring_ioc.services.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserControl1 {
    @Autowired
    private UserService1 userService1;
    public void save(){
        User1 user1=new User1();
        System.out.println("in userControl save...");
        userService1.save();
    }

    public void setUserService1(UserService1 userService1) {
        this.userService1 = userService1;
    }
}
