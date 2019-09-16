package com.christ.spring_ioc.pojos;

import com.christ.spring_ioc.myinterface.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Controller
@Service
//@Repository
public class JananeseGirl1 implements Girl {
    @Value("Alice")
    private String name;
    @Value("20")
    private int age;
   //@Value("Linda")
    public void setName(String name) {
        this.name = name;
    }
    //@Value("30")
    public void setAge(int age) {
        this.age = age;
    }
public JananeseGirl1(){

}
/*@Autowired
    public JananeseGirl1(@Value("Lucy") String name,@Value("20") int age) {
        this.name = name;
        this.age = age;
    }*/

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
