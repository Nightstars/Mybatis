package com.chrit.aop.calc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.chrit.aop.calc.*.*(..))")
    public void perf(){ }
    @Around("perf()")
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
