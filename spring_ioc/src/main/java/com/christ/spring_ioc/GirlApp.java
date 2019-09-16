package com.christ.spring_ioc;

import com.christ.spring_ioc.pojos.Boy;
import com.christ.spring_ioc.pojos.JananeseGirl;
import com.christ.spring_ioc.pojos.KoeraGirl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GirlApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("boy/boy.xml");
        JananeseGirl jananeseGirl=(JananeseGirl) applicationContext.getBean("japaneseGirl");
        KoeraGirl koeraGirl=(KoeraGirl) applicationContext.getBean("koeraGirl");
        System.out.println(jananeseGirl);
        System.out.println(jananeseGirl.getName());
        System.out.println(jananeseGirl.getAge());
        jananeseGirl.kiss();
        System.out.println(koeraGirl);
        System.out.println(koeraGirl.getName());
        System.out.println(koeraGirl.getAge());
        koeraGirl.kiss();
        Boy boy=(Boy) applicationContext.getBean("boy");
        System.out.println(boy.getName());
        System.out.println(boy.getGirl());
        boy.getGirl().kiss();
        Boy boy1=(Boy) applicationContext.getBean("boy1");
        System.out.println(boy1.getName());
        System.out.println(boy1.getGirl());
        boy1.getGirl().kiss();

    }
}
