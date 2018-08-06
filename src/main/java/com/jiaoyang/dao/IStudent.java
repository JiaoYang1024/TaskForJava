package com.jiaoyang.dao;

import com.jiaoyang.model.Student;
import org.apache.ibatis.annotations.Select;

public interface IStudent {

    @Select("SELECT * FROM student WHERE name = #{name}")
    public Student getUserByName(String name);

    String create =

            "CREATE TABLE employee "+
            "("+
            "ID BIGINT NOT NULL AUTO_INCREMENT,"+
            "create_at BIGINT NOT NULL,"+
           "update_at BIGINT NOT NULL,"+
            "name VARCHAR(255) NOT NULL,"+
            "age INT  NOT NULL,"+
            "sex VARCHAR(255)  NOT NULL,"+
            "job VARCHAR(255)  NOT NULL,"+
            "PRIMARY KEY(ID)"+
            ")";
    @Select(create)
    public void createTable();


    /*@Select("INSERT INTO employee (create_at,update_at,name,age,sex,job) VALUES (#{create_at,update_at,name,age,sex,job})")
    public void insertRecord(long create_at,long update_at,String name,int age,String sex,String job);*/

}
