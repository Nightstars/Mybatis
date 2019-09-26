package com.chrit.aop.transaction.staticProxy;

public class StudentServiceImpl implements StudentService{
    @Override
    public void save() {
        System.out.println("saving student object...");
    }

    @Override
    public void update() {
        System.out.println("modify student info");
    }

    @Override
    public void delete(int id) {
        System.out.println("deleting student..."+id);
    }
}
