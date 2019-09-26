package com.christ.ajax;

import com.christ.pojos.User;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxControl {
    @RequestMapping(value = "/ajax1",produces = "text/html;charset=utf-8")
    public void ajax1(HttpServletResponse response) throws IOException {
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<h2>Hello Ajax</h2>");
        printWriter.close();
    }
    @RequestMapping("ajax2")
    @ResponseBody
    public String ajax2() {
        Gson gson=new Gson();
        User user=new User("Tom","123456");
        return gson.toJson(user);
    }
    @RequestMapping("ajax3")
    @ResponseBody
    public User ajax3() {
        return new User("Tom","123456");
    }
    @RequestMapping(value = "/ajax4",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String ajax4(String id,User user) {
        Gson gson=new Gson();
        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","123"));
        userList.add(new User("李四","1234"));
        userList.add(new User("王五","12345"));
        userList.add(new User("Tom","123"));
        userList.add(new User("Jack","1234"));
        userList.add(new User("Lucy","12345"));
        userList.add(new User("马六","123"));
        userList.add(new User("何七","1234"));
        userList.add(new User("Lucy","12345"));
        userList.add(new User(user.getUsername(),user.getPassword()));
        System.out.println("id="+id);
        System.out.println(user.getUsername()+","+user.getPassword());
        return gson.toJson(userList);
    }
    @RequestMapping("ajax5")
    @ResponseBody
    public List<User> ajax5() {
        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","123"));
        userList.add(new User("李四","1234"));
        userList.add(new User("王五","12345"));
        userList.add(new User("Tom","123"));
        userList.add(new User("Jack","1234"));
        userList.add(new User("Lucy","12345"));
        userList.add(new User("Tom","123"));
        userList.add(new User("Jack","1234"));
        userList.add(new User("Lucy","12345"));
        return userList;
    }
    @RequestMapping("/ajax6")
    public String ajax6() {
        return "ajax";
    }
}
