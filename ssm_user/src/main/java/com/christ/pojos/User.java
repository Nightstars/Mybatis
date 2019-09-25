package com.christ.pojos;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}'+"\n";
    }
}
