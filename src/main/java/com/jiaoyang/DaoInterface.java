package com.jiaoyang;

import com.jiaoyang.model.Student;

import java.util.List;

public interface DaoInterface {



    public void createTable();

    public void deleteTable();

    public void insertStudent(Student student);

    public void deleteStudent(int id);

    public void update(Student student);

    public List<Student> queryAll();

    public Student query(int id);



}
