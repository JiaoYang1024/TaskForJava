package com.jiaoyang.mybatis;

import com.jiaoyang.DaoInterface;
import com.jiaoyang.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class DaoByMybatis implements DaoInterface {

   private SqlSessionFactory  sqlSessionFactory;
  private   SqlSession   session;
    public DaoByMybatis(){

        try {
            Reader   reader = Resources.getResourceAsReader("mybatis/Configure.xml");
               sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
          //  sqlSessionFactory.getConfiguration().addMapper(IStudent.class);
         
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void closeSession(){
        session.commit();
        session.close();
    }

    @Override
    public void createTable() {

        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
        iStudent.createTable();
        closeSession();
    }

    @Override
    public void deleteTable() {
        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
        iStudent.deleteTable();
        closeSession();
    }

    @Override
    public void insertStudent(Student student) {
        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
        iStudent.insertUser(student);
        closeSession();
    }

    @Override
    public void deleteStudent(int id) {
        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
        iStudent.deleteUser(id);
        closeSession();
    }

    @Override
    public void update(Student student) {
        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
        iStudent.update(student);
        closeSession();
    }

    @Override
    public List<Student> queryAll() {
        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
       List<Student> students =  iStudent.queryAll();
        closeSession();
        return students;
    }

    @Override
    public Student query(int id) {
        //Student student = session.selectOne("com.jiaoyang.model.StudentMapper.GetUserByID",1);
        session = sqlSessionFactory.openSession();
        IStudent iStudent = session.getMapper(IStudent.class);
        Student student=  iStudent.query(id);
        closeSession();
        return student;
    }
}
