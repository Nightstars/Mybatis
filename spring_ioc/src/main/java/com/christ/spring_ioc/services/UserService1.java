package com.christ.spring_ioc.services;


import com.christ.spring_ioc.dao.UserDaoImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService1 {
    @Autowired
    private UserDaoImpl1 userDaoImpl1;
    public void save() {
        System.out.println("in UserService...");
        userDaoImpl1.save();
    }

    public void setUserDaoImpl1(UserDaoImpl1 userDaoImpl1) {
        this.userDaoImpl1 = userDaoImpl1;
    }
}
