package com.christ.service;

import com.christ.dao.UserDao;
import com.christ.pojos.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    @Transactional(readOnly = false, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public void save (User user){
        userDao.insertUser(user);
    }
    @Transactional(readOnly = true, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public List<User> getAll(){
        return userDao.getAll();
    }
    @Transactional(readOnly = false, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public void modify (User user){
        userDao.updateUser(user);
    }
    @Transactional(readOnly = false, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public void delete (int id) {
        userDao.deleteUser(id);
    }
    @Transactional(readOnly = true, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public User getUser (int id){
           return userDao.getUserById(id);
    }
    @Transactional(readOnly = true, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,timeout = 3)
    public Page<User> getPage (int pageNum, int pageSize){
        Page<User> page1 =  PageHelper.startPage(pageNum,pageSize);
        userDao.getAll();
        return page1;
    }
}
