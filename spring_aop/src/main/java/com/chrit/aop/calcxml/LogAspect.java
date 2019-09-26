package com.chrit.aop.calcxml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

public class LogAspect {
    /*public void turnOff(ProceedingJoinPoint pjp){
        if(pjp.getSignature().getName().equals("add"))
            System.out.println("begin calculate:\t"+pjp.getSignature().getName()+"\t"+pjp.getArgs()[0]+"+"+pjp.getArgs()[1]);
        else
            System.out.println("begin calculate:\t"+pjp.getSignature().getName()+"\t"+pjp.getArgs()[0]+"-"+pjp.getArgs()[1]);
    }
    public void afterShow(ProceedingJoinPoint pjp,Object object) throws Throwable {
        Object object1=pjp.proceed();
        if(pjp.getSignature().getName().equals("add"))
            System.out.println("result\t"+pjp.getArgs()[0]+"+"+pjp.getArgs()[1]+"="+object);
        else
            System.out.println("result\t"+pjp.getArgs()[0]+"-"+pjp.getArgs()[1]+"="+object);
    }*/
    public Object aroundShow(ProceedingJoinPoint pjp) throws Throwable {
        if(pjp.getSignature().getName().equals("add"))
            System.out.println("begin calculate:\t"+pjp.getSignature().getName()+"\t"+pjp.getArgs()[0]+"+"+pjp.getArgs()[1]);
        else
            System.out.println("begin calculate:\t"+pjp.getSignature().getName()+"\t"+pjp.getArgs()[0]+"-"+pjp.getArgs()[1]);
        Object object=pjp.proceed();
        if(pjp.getSignature().getName().equals("add"))
            System.out.println("result\t"+pjp.getArgs()[0]+"+"+pjp.getArgs()[1]+"="+object);
        else
            System.out.println("result\t"+pjp.getArgs()[0]+"-"+pjp.getArgs()[1]+"="+object);
        return object;
    }
}
