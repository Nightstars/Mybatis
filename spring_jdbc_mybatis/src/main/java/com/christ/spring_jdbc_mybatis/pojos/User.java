package com.christ.spring_jdbc_mybatis.pojos;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private Date birthday;
    public User(){

    }
    public User(int id, String name, String password, int age, Date birthday) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
    }
}
