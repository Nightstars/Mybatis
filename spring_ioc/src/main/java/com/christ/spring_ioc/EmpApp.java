package com.christ.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hello/hello.xml");
        Emp emp=(Emp) applicationContext.getBean("emp");
        System.out.println(emp);
        Emp emp1=(Emp) applicationContext.getBean("emp1");
        System.out.println(emp1);
    }
}
