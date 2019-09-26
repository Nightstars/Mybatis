package com.chrit.aop.transaction.staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class App2 {
    public static void main(String[] args) {
        StudentService studentService1=new StudentServiceImpl();
        TransactionAspect transactionAspect=new TransactionAspect();
        Class[] arr={StudentService.class};
        InvocationHandler h=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoking..."+method.getName()+","+args);
                Object result=null;
                transactionAspect.start();
                try{
                    result= method.invoke(studentService1,args);
                    transactionAspect.commit();
                }catch (Exception e){
                    transactionAspect.rollBack();
                }
                return result;
            }
        };
        StudentService studentService= (StudentService) Proxy.newProxyInstance(App2.class.getClassLoader(),arr,h);
        studentService.save();
        studentService.update();
        studentService.delete(1);

    }
}
