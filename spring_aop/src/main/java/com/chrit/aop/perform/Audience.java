package com.chrit.aop.perform;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
    @Pointcut("execution(* com.chrit.aop.perform.*.*(..))")
    public void perf(){

    }
    @Before("perf()")
    public void turnOff(){
        System.out.println("turn Off your smartPhone...");
    }
    @After("perf()")
    public void applaud(){
        System.out.println("it is very good");
    }
    @Around("perf()")
    public Object aroundShow(ProceedingJoinPoint pjp) throws Throwable {
        long start=System.currentTimeMillis();
        System.out.println("in around before...");
        System.out.println(pjp.getSignature().toLongString()+"\n"+pjp.getArgs().length);
        Object object=pjp.proceed();
        long end=System.currentTimeMillis();
        System.out.println(pjp.getSignature().getName()+" execute functin used\t"+(end-start)+"\tms");
        System.out.println("in around after...");
        return object;
    }
}
