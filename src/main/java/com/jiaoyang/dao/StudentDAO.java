package com.jiaoyang.dao;

import com.jiaoyang.model.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {


    public void setDataSource(DataSource ds);

    public void createTable();
    public void deleteTable();

    public int insertRecord(Student student);
    public int deleteRecord(String name);
    public int update(String name,String newName);
    public Student query(String name);

    public List<Student> queryAll();


}
