package com.christ.utils;

import com.christ.entities.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getUserById(int id);
    public List<User> getAll();
}
