package com.christ.utils;

import com.christ.entities.Student;

public interface StudnetDao {
    public void insertStudent(Student student);
    public Student getStudentById(int id);
}
