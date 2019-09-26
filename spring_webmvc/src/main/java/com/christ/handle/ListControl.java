package com.christ.handle;

import com.christ.pojos.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ListControl {
    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("list");
        User user=new User();
        user.setUsername("Tom");
        user.setPassword("123456");
        List<User> userList=new ArrayList<User>();
        userList.add(new User("Tom","123"));
        userList.add(new User("Jack","1234"));
        userList.add(new User("Lucy","1234"));
        modelAndView.addObject("data","this is modelView data");
        modelAndView.addObject("data1",user);
        modelAndView.addObject("data2",userList);
        return modelAndView;
    }
    @RequestMapping("list1")
    public String list1(ModelMap modelMap){
        modelMap.addAttribute("data","model Map can also save data");
        User user=new User();
        user.setUsername("Alice");
        user.setPassword("123");
        modelMap.addAttribute("data1",user);
        List<User> userList=new ArrayList<User>();
        userList.add(new User("Tom","123"));
        userList.add(new User("Jack","1234"));
        userList.add(new User("Lucy","1234"));
        modelMap.addAttribute("data2",userList);
        return "list";
    }
    @RequestMapping("list2")
    public String list2(Map map){
        map.put("data","model Map can also save data");
        User user=new User();
        user.setUsername("Alice");
        user.setPassword("123");
        map.put("data1",user);
        List<User> userList=new ArrayList<User>();
        userList.add(new User("Tom","123"));
        userList.add(new User("Jack","1234"));
        userList.add(new User("Lucy","12345"));
        map.put("data2",userList);
        return "list";
    }
}
