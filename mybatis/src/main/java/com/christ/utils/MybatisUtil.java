package com.christ.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {
    public static  SqlSessionFactory getSqlSessionFactory() throws IOException {
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory;
    }
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        System.out.println(sqlSessionFactory);
    }
}
