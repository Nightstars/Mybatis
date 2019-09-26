package com.chrit.aop.calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop.xml");
        Calc calc=(Calc)applicationContext.getBean("calcImpl");
        calc.add(2,1);
        calc.sub(2,1);
    }
}
