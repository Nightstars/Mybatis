package com.christ.entities;

public class Emp {
    private int id;
    private String name;
    private float salary;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Emp(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    public Emp( String name, float salary,Dept dept) {
        this.name = name;
        this.salary = salary;
        this.dept=dept;
    }

    public Emp(int id, String name, float salary,Dept dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept_id=" + dept.getId() +
                '}';
    }
}
