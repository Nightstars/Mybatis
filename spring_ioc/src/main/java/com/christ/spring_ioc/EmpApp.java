package com.christ.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hello/hello.xml");
        Emp emp=applicationContext.getBean(Emp.class);
        System.out.println(emp);
    }
}
