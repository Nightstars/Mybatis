package com.chrit.aop.transaction.staticProxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class App3 {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\");
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(StudentServiceImpl.class);
        TransactionAspect transactionAspect=new TransactionAspect();
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(methodProxy.getSignature().toString()+"\n"+methodProxy.getSuperName());
                transactionAspect.start();
                Object result = null;
                try{
                    result=methodProxy.invokeSuper(o,objects);
                    transactionAspect.commit();
                }catch (Exception e){
                    transactionAspect.rollBack();
                }

                return result;
            }
        };
        enhancer.setCallback(methodInterceptor);
        StudentServiceImpl studentService=(StudentServiceImpl) enhancer.create();
        studentService.save();
        studentService.update();
        studentService.delete(10);
    }
}
