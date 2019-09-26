package com.chrit.aop.perform;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop.xml");
        Performer performer=(Performer) applicationContext.getBean("performerImpl");
        performer.show();
        /*String str=performer.show("hello");
        System.out.println(str);*/
    }
}
