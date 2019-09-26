package com.christ.spring_jdbc_mybatis.services;

import com.christ.spring_jdbc_mybatis.dao.UserDaoMybatis;
import com.christ.spring_jdbc_mybatis.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserDaoMybatis userDaoMybatis;

    @Transactional(readOnly = false, rollbackFor = java.lang.Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public void save (User user) throws Exception {
        Thread.sleep(5000);
        userDaoMybatis.insertUser(user);
        //throw new RuntimeException("error");
        //throw new Exception("error");
    }
}
