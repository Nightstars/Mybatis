package com.christ.spring_ioc.dao;

import com.christ.spring_ioc.myinterface.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl1 implements UserDao {
    @Override
    public void save() {
        System.out.println("in UserDaoImpl...");
    }
}
