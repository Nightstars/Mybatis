package com.chrit.aop.transaction.staticProxy;

public class StudentServiceImplProxy implements StudentService {
    StudentServiceImpl studentServiceImpl=new StudentServiceImpl();
    TransactionAspect transactionAspect=new TransactionAspect();
    @Override
    public void save() {
        transactionAspect.start();
        try {
            studentServiceImpl.save();
            transactionAspect.commit();
        }catch (Exception e){
            transactionAspect.rollBack();
        }
    }

    @Override
    public void update() {
        transactionAspect.start();
        try {
            studentServiceImpl.update();
            transactionAspect.commit();
        }catch (Exception e){
            transactionAspect.rollBack();
        }
    }

    @Override
    public void delete(int id) {
        transactionAspect.start();
        try {
            studentServiceImpl.delete(id);
            transactionAspect.commit();
        }catch (Exception e){
            transactionAspect.rollBack();
        }
    }
}
