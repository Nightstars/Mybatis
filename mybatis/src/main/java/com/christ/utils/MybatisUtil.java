package com.christ.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if(sqlSessionFactory==null){
            Reader reader= Resources.getResourceAsReader("conf.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }
        return sqlSessionFactory;
    }
    public static  SqlSessionFactory getSqlSessionFactory2() throws IOException {
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sqlSessionFactory2=new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory2;
    }
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        System.out.println(sqlSessionFactory);
    }
}
