package com.christ.spring_jdbc_mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if(sqlSessionFactory==null){
            Reader reader= Resources.getResourceAsReader("mybatisConf.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }
        return sqlSessionFactory;
    }
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        Logger logger= LogManager.getLogger("mylog");
        logger.info(sqlSessionFactory);
    }
}
