package com.jiaoyang.dao;

import com.jiaoyang.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setCreate_at(rs.getLong("create_at"));
        student.setUpdate_at(rs.getLong("update_at"));
        student.setName(rs.getString("name"));
        student.setQQ(rs.getString("QQ"));
        student.setClassType(rs.getString("classType"));
        student.setStartTime(rs.getString("startTime"));
        student.setOriginalSchool(rs.getString("originalSchool"));
        student.setStudentNo(rs.getString("studentNo"));
        student.setDailyURL(rs.getString("dailyURL"));
        student.setWish(rs.getString("wish"));
        student.setSenior(rs.getString("senior"));
        student.setKnowingWay(rs.getString("knowingWay"));
        return student;
    }
}
