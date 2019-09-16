package com.christ.spring_ioc.pojos;

import com.christ.spring_ioc.myinterface.Girl;

public class JananeseGirl implements Girl {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
public JananeseGirl(){

}
    public JananeseGirl(String name, int age) {
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
        System.out.println("japandese girl can kiss");
    }

    @Override
    public String toString() {
        return "JananeseGirl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
