package com.jiaoyang.dao;

import com.jiaoyang.model.Employee;
import com.jiaoyang.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudent {



    @Select("SELECT * FROM student WHERE name = #{name}")
    public Student getUserByName(String name);


    @Insert("INSERT INTO employee(create_at,update_at,name,age,sex,job) VALUES ('2000','1000',#{name},'33',#{sex},'教师' )")
    public void insertRecordTest(@Param("name")String name, @Param("sex") String sex);

    @Insert("INSERT INTO employee(create_at,update_at,name,age,sex,job) VALUES ('2000','1000',#{name},'33','男','教师' )")
    public void insertRecord(String name);

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
//  @Select(create)
//public void createTable();


    /*@Select("INSERT INTO employee(name,age,sex,job) VALUES ('#{name}', '#{age}', '#{sex}', '#{job}')")
    public void insertRecord(String name,int age,String sex,String job);*/




    public void createTable();

    public void deleteTable();

    public void insertUser(Employee user);

    public void deleteUser(int id);

    public void update(Employee user);

    public List<Employee> queryAll();

    public Employee query(int id);

}








