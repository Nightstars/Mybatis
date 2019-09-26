package com.christ.spring_jdbc_mybatis.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

public class AppTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("db/mybatis.xml");
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
        JdbcTemplate jdbcTemplate=(JdbcTemplate) applicationContext.getBean("jdbcTemple");
        System.out.println(jdbcTemplate);
    }
}
