package com.christ.spring_ioc;

public class BeanDemo {
    private BeanDemo(){
        System.out.println("in BeanDemo");
    }
    public String hello(){
        return "Hello BeamDemo";
    }
}
