package com.christ.spring_ioc.dao;

import com.christ.spring_ioc.myinterface.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("in UserDaoImpl...");
    }
}
