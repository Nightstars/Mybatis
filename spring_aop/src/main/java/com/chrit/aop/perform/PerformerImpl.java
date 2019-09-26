package com.chrit.aop.perform;

import org.springframework.stereotype.Component;

@Component
public class PerformerImpl implements Performer{
    public void show() {
        int sum=0;
        for (int i=0;i<100000;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("listen to music...");
    }

    @Override
    public String show(String str) {
        return str+"Spring AOP";
    }
}
