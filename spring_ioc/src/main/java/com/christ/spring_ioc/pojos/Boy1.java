package com.christ.spring_ioc.pojos;

import com.christ.spring_ioc.myinterface.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy1 {
    private String name;
    private Girl girl;
    public Boy1(){

    }
    public Boy1(String name, Girl girl){
        this.name=name;
        this.girl=girl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Autowired @Qualifier("japaneseGirl")
    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", girl=" + girl +
                '}';
    }
}
