package com.christ.spring_ioc.pojos;

import com.christ.spring_ioc.myinterface.Girl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KoeraGirl1 implements Girl {
    @Value("Lucy")
    private String name;
    @Value("21")
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public KoeraGirl1(){

    }
    public KoeraGirl1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void kiss() {
        System.out.println("koera girl can kiss");
    }

    @Override
    public String toString() {
        return "KoeraGirl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
