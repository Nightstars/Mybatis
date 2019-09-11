package com.christ.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        //get spring ioc container object
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hello/hello.xml");
        //get container created object
        //Hello hello=(Hello) applicationContext.getBean("helloWorld");
        Hello hello=applicationContext.getBean(Hello.class);
        //do function of boject
        hello.sayHello();
    }
}
