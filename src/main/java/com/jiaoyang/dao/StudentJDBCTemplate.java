package com.jiaoyang.dao;

import com.jiaoyang.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

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
    public void createTable() {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE student ");
        sql.append("(");
        sql.append("ID BIGINT NOT NULL AUTO_INCREMENT,");
        sql.append("create_at BIGINT NOT NULL,");
        sql.append("update_at BIGINT NOT NULL,");
        sql.append("name VARCHAR(255) NOT NULL,");
        sql.append("QQ VARCHAR(255)  NOT NULL,");
        sql.append("classType VARCHAR(255)  NOT NULL,");
        sql.append("startTime VARCHAR(255)  NOT NULL,");
        sql.append("originalSchool VARCHAR(255)  NOT NULL,");
        sql.append("studentNo VARCHAR(255)  NOT NULL,");
        sql.append("dailyURL VARCHAR(255)  NOT NULL,");
        sql.append("wish VARCHAR(255)  NOT NULL,");
        sql.append("senior VARCHAR(255)  NOT NULL,");
        sql.append("knowingWay VARCHAR(255)  NOT NULL,");
        sql.append("PRIMARY KEY(ID)");
        sql.append(")");
        jdbcTemplateObject.execute(sql.toString());
    }

    @Override
    public void deleteTable() {
        String sql = "DROP TABLE student";
        jdbcTemplateObject.execute(sql);
    }


    @Override
    public int insertRecord(Student student) {
        String sql = "INSERT INTO student " +
                "(create_at, update_at, name, QQ, classType, startTime, originalSchool, studentNo, dailyURL, wish, senior, knowingWay)" +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

     return  jdbcTemplateObject.update(sql,student.getCreate_at(),
                student.getUpdate_at(),student.getName(),student.getQQ(),student.getClassType(),
                student.getStartTime(),student.getOriginalSchool(),student.getStudentNo(),
                student.getDailyURL(),student.getWish(),student.getSenior(),student.getKnowingWay());


    }

    @Override
    public int deleteRecord(String name) {
        String sql = "DELETE FROM student WHERE name = ?";
        return jdbcTemplateObject.update(sql,name);

    }

    @Override
    public int update(String newName,String name) {
        String sql = "UPDATE student SET name = ? WHERE name = ?";
        return   jdbcTemplateObject.update(sql,newName,name);

    }

    @Override
    public Student query(String name) {
        String sql = "SELECT * FROM student WHERE name = ?";
       Student student =  jdbcTemplateObject.queryForObject(sql,new StudentMapper(),name);
        return student;
    }

    @Override
    public List<Student> queryAll() {
        String sql = "SELECT * FROM student";
        List<Student> students = jdbcTemplateObject.query(sql,new StudentMapper());
        return students;
    }


}
