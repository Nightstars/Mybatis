package com.christ.controller;

import com.christ.pojos.User;
import com.christ.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
public class UserControl {
   @Autowired
   UserService userService;
    @RequestMapping("list")
    public ModelAndView list(Integer pageNum,Integer pageSize){
        if(pageNum==null){
            pageNum=1;
        }else  if(pageSize==null){
            pageSize=10;
        }
        List<User> userList=userService.getPage(pageNum,pageSize).getResult();
        ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return modelAndView;
    }
    @RequestMapping("listAll")
    @ResponseBody
    public List<User> listall(){
        List<User> userList=userService.getAll();
        System.out.println(new Date()+"\trequest successfully");
        return userList;
    }
    @RequestMapping("add")
    public ModelAndView add(User user){
        userService.save(user);
        List<User> userList=userService.getPage(1,10).getResult();
        ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return modelAndView;
    }
    @RequestMapping("modify")
    public String modify(User user){
        userService.modify(user);
        List<User> userList=userService.getAll();
        //ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return "redirect:list?pageNum=1&pageSize=10";
    }
    @RequestMapping("delete")
    public String delete(String id){
        userService.delete( Integer.parseInt(id));
        //List<User> userList=userService.getAll();
        //ModelAndView modelAndView=new ModelAndView("list","users",userList);
        return "redirect:list?pageNum=1&pageSize=10";
    }
    @RequestMapping("preview")
    public ModelAndView preview(String id){
        User user=userService.getUser( Integer.parseInt(id));
        ModelAndView modelAndView=new ModelAndView("modify","user",user);
        return modelAndView;
    }
}
