package com.christ.spring_ioc;

import com.christ.spring_ioc.pojos.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boy {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("boy/app.xml");
        JananeseGirl1 jananeseGirl1=(JananeseGirl1)applicationContext.getBean(JananeseGirl1.class);
        System.out.println(jananeseGirl1);
        KoeraGirl1 koeraGirl1=(KoeraGirl1)applicationContext.getBean(KoeraGirl1.class);
        System.out.println(koeraGirl1);
        Boy1 boy=(Boy1)applicationContext.getBean(Boy1.class);
        System.out.println(boy);
        boy.getGirl().kiss();
    }
}
