package com.christ.spring_ioc.control;

import com.christ.spring_ioc.pojos.User;
import com.christ.spring_ioc.services.UserService;

public class UserControl {
    private UserService userService;
    public void save(){
        User user=new User();
        System.out.println("in userControl save...");
        userService.save();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
