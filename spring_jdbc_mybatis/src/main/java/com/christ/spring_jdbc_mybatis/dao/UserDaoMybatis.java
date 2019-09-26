package com.christ.spring_jdbc_mybatis.dao;

import com.christ.spring_jdbc_mybatis.pojos.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDaoMybatis {
    public void insertUser(User user);
    public User getUserById(int id);
    public List<User> getAll();
}
