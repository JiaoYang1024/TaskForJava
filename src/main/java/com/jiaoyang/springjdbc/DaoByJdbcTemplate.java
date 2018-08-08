package com.jiaoyang.springjdbc;

import com.jiaoyang.DaoInterface;
import com.jiaoyang.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoByJdbcTemplate implements DaoInterface {


    StudentJDBCTemplate jdbcTemplate;
    public DaoByJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc/application-beans.xml");
        jdbcTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

    }

    @Override
    public void createTable() {
        jdbcTemplate.createTable();
    }

    @Override
    public void deleteTable() {
        jdbcTemplate.deleteTable();
    }

    @Override
    public void insertStudent(Student student) {
        jdbcTemplate.insertRecord(student);
    }

    @Override
    public void deleteStudent(int id) {
        jdbcTemplate.deleteRecord(id);
    }

    @Override
    public void update(Student student) {
        jdbcTemplate.update(student);
    }

    @Override
    public List<Student> queryAll() {
        return  jdbcTemplate.queryAll();

    }

    @Override
    public Student query(int id) {
        return jdbcTemplate.query(id);
    }
}
