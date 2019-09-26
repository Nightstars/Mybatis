package com.chrit.aop.transaction.staticProxy;

public class TransactionAspect {
    public void start(){
        System.out.println("begin transaction...");
    }
    public void commit(){
        System.out.println("commit transaction...");
    }
    public void rollBack(){
        System.out.println("rollBack transaction...");
    }
}
