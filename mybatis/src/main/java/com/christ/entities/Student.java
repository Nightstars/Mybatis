package com.christ.entities;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int sno;
    private Date birthday;
    private int score;

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

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public Student(){}

    public Student(String name, int sno, Date birthday, int score) {
        this.name = name;
        this.sno = sno;
        this.birthday = birthday;
        this.score = score;
    }

    public Student(int id, String name, int sno, Date birthday, int score) {
        this.id = id;
        this.name = name;
        this.sno = sno;
        this.birthday = birthday;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sno=" + sno +
                ", birthday=" + birthday +
                ", score=" + score +
                '}';
    }
}
