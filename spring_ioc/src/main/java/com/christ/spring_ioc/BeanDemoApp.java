package com.christ.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemoApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hello/hello.xml");
        BeanDemo beanDemo=applicationContext.getBean(BeanDemo.class);
        String hello=beanDemo.hello();
        System.out.println(hello);
    }
}
