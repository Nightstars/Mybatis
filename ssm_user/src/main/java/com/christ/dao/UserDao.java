package com.christ.dao;


import com.christ.pojos.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public void insertUser(User user);
    public User getUserById(int id);
    public List<User> getAll();
    public void updateUser(User user);
    public void deleteUser(int id);
}
