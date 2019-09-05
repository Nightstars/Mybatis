package com.christ.utils;

import com.christ.entities.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao2 {
    @Insert("insert  into users(name,password,age) values(#{name},#{password},#{age}) ")
    public void insertUser(User user);
    @Delete("delete from users where id=#{id}")
    public void deleteUser(int id);
    @Update("update users set name= #{name},password=#{password},age=#{age} where id=#{id}")
    public void updateUser(User user);
    @Select("select * from users where id=#{id}")
    public User getUserById(int id);
    @Select(" select * from users")
    public List<User> getAll();
}
