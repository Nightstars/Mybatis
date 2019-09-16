package com.christ.spring_ioc.services;

import com.christ.spring_ioc.dao.UserDaoImpl;

public class UserService {
    private UserDaoImpl userDaoImpl;
    public void save() {
        System.out.println("in UserService...");
        userDaoImpl.save();
    }

    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }
}
