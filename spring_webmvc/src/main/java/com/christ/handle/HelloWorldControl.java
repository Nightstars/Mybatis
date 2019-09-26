package com.christ.handle;


import com.christ.pojos.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldControl {
    @RequestMapping("hello")
    public String sayHello(){
        System.out.println("in hello world sayHello...");
        return "hello";
    }
    @RequestMapping("login")
    public String login(HttpServletRequest request){
        System.out.println("in hello world control login...");
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(name+"\t"+password);
        return "hello";
    }
    @RequestMapping("login1")
    public String login1(String username,String password){
        System.out.println("in hello world control login1...");
        System.out.println(username+"\t"+password);
        return "hello";
    }
    @RequestMapping(value = "login2",method = {RequestMethod.GET,RequestMethod.POST})
    public String login2(User user){
        System.out.println("in hello world control login2...");
        System.out.println(user.getUsername()+"\t"+user.getPassword());
        return "hello";
    }
}
