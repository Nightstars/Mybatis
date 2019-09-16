package com.christ.spring_ioc;

import com.christ.spring_ioc.control.UserControl;
import com.christ.spring_ioc.control.UserControl1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("user/user.xml");
        UserControl userControl=(UserControl) applicationContext.getBean("userControl");
        userControl.save();
        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("user/user1.xml");
        UserControl1 userControl1=(UserControl1)applicationContext1.getBean("userControl1");
        userControl1.save();
    }
}
