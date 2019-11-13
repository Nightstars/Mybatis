package com.christ.controller;

import com.christ.pojos.User;
import com.christ.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserControl {
   @Autowired
   UserService userService;
    @RequestMapping("list")
    public ModelAndView list(Integer pageNum,Integer pageSize){
        List<User> userList=userService.getPage(pageNum,pageSize).getResult();
        ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return modelAndView;
    }
    @RequestMapping("add")
    public ModelAndView add(User user){
        userService.save(user);
        List<User> userList=userService.getPage(1,10).getResult();
        ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return modelAndView;
    }
    @RequestMapping("modify")
    public ModelAndView modify(User user){
        userService.modify(user);
        List<User> userList=userService.getAll();
        ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return modelAndView;
    }
    @RequestMapping("delete")
    public ModelAndView delete(String id){
        userService.delete( Integer.parseInt(id));
        List<User> userList=userService.getAll();
        ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return modelAndView;
    }
    @RequestMapping("preview")
    public ModelAndView preview(String id){
        User user=userService.getUser( Integer.parseInt(id));
        ModelAndView modelAndView=new ModelAndView("modify","user",user);
        return modelAndView;
    }
}