package com.christ.spring_ioc.other;

import org.apache.logging.log4j.LogManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("other/app.xml");
        //Boy boy=(Boy)applicationContext.getBean("boy");
        Logger logger= LogManager.getLogger("mylog");
        /*logger.info(boy);
        logger.info(boy.getName());
        logger.info(boy.getGirl());
        logger.info(boy.getGirl().kiss());*/
        //System.out.println(boy);
        //System.out.println(boy.getName());
        //System.out.println(boy.getGirl());
        //boy.getGirl().kiss();
        BeanCollection beanCollection=(BeanCollection)applicationContext.getBean("beanCollection");
        logger.info(beanCollection.getCourses());
        Map<String,String> cups=beanCollection.getCups();
        //Set<String> set=cups.keySet();
        for (Map.Entry<String, String> entry : cups.entrySet()) {
            logger.info("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        Properties properties=(Properties)beanCollection.getPs();
        Set<Map.Entry<Object,Object>> entries=properties.entrySet();
        for(Map.Entry<Object,Object> entry:entries){
            logger.info(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
