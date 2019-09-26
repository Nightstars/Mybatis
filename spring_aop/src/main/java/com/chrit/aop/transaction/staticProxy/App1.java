package com.chrit.aop.transaction.staticProxy;

public class App1 {
    public static void main(String[] args) {
        StudentService studentService=new StudentServiceImplProxy();
        studentService.save();
    }
}
