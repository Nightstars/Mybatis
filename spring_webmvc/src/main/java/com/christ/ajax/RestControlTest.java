package com.christ.ajax;

import com.christ.pojos.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestControlTest {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String rest1(@PathVariable("id") int id){
        System.out.println("id="+id);
        return "hello";
    }
    @RequestMapping(value = "/user/{test}",method = RequestMethod.DELETE)
    @ResponseBody
    public String rest2(@PathVariable("test") int test){
        System.out.println("Be deleting id:"+test);
        return "Be deleting id:"+test;
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    public String rest3(@RequestBody User user){
        System.out.println(user);
        return "PUT test";
    }
}
