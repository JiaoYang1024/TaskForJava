package com.jiaoyang.springjdbc;

import com.jiaoyang.model.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {


    public void setDataSource(DataSource ds);

    public void createTable();
    public void deleteTable();

    public int insertRecord(Student student);
    public int deleteRecord(int id);
    public int update(Student student);
    public Student query(int id);

    public List<Student> queryAll();


}
