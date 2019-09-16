package com.christ.spring_ioc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class C3p0App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("c3p0/c3p0.xml");
        DataSource dataSource =(ComboPooledDataSource) applicationContext.getBean("c3p0");
        System.out.println(dataSource.getConnection());
    }
}
