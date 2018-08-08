package com.jiaoyang;

import com.jiaoyang.jdbc.DaoByJDBC;
import com.jiaoyang.model.Student;
import com.jiaoyang.mybatis.DaoByMybatis;
import com.jiaoyang.springjdbc.DaoByJdbcTemplate;

import java.util.Date;
import java.util.List;


public class App {

    static DaoInterface dao;

    public static void main( String[] args ) {

        // dao = new DaoByJDBC();
         //dao = new DaoByJdbcTemplate();
         dao = new DaoByMybatis();
        //deleteTable();
          //  createTable();

       // insert();
       // delete();
        //update();
       // query();
        queryAll();
    }


    private static void createTable(){
        dao.createTable();
    }

    private static void deleteTable(){
        dao.deleteTable();
    }

    private static void insert(){
        Student student = new Student("王庸之", "861684014", "JAVA工程师", "2018年4月27日之前", "南京航空航天大学机电学院", "JAVA-3834", "http://www.jnshu.com/school/21289/daily", "破釜沉舟，破而后立。", "宋尚", " 从\"知乎\"处了解到IT修真院的。");
        Student student1 = new Student("张无忌1", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student2 = new Student("张无忌2", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student3 = new Student("张无忌3", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student4 = new Student("张无忌4", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        dao.insertStudent(student);
        dao.insertStudent(student1);
        dao.insertStudent(student2);
        dao.insertStudent(student3);
        dao.insertStudent(student4);
    }

    private static void delete(){
        dao.deleteStudent(5);
    }

    private static void update(){
        Student zhang = dao.query(2);
        zhang.setUpdate_at(new Date().getTime());
        zhang.setName("金毛狮王");
        dao.update(zhang);
    }

    private static void query(){
        System.out.println(dao.query(3).toString());
    }

    private static void queryAll(){
        List<Student> students = dao.queryAll();
        for (Student s: students){
            System.out.println(s.toString());
        }
    }
}
