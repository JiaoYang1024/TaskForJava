package com.jiaoyang.dao;

import com.jiaoyang.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;



    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }




    @Override
    public void insertRecord(Student student) {

    }

    @Override
    public Student query(String name) {
        return null;
    }

    @Override
    public List<Student> queryAll() {
        String sql = "SELECT * FROM student";
        List<Student> students = jdbcTemplateObject.query(sql,new StudentMapper());
        return students;
    }

    public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
    }
}
