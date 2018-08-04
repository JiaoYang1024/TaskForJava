package com.jiaoyang.dao;

import com.jiaoyang.model.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {


    public void setDataSource(DataSource ds);

    public void insertRecord(Student student);

    public Student query(String name);

    public List<Student> queryAll();


}
