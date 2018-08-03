package com.jiaoyang.dao;

import com.jiaoyang.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DaoByJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/learn_java";
   // private static final String URL = "jdbc:mysql://localhost:3306/learn_java?useSSL=false&serverTimezone=GMT";
    //private static final String USER = "root";
    //private static final String PASSWORD = "password";
   private Connection   conn;


    private void initConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Properties properties = new Properties();
            properties.setProperty("user","root");
            properties.setProperty("password","password");
            properties.setProperty("useSSL","false");
            properties.setProperty("serverTimezone","GMT");

            conn = DriverManager.getConnection(URL,properties);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void createTable(){

        Statement stmt = null;

        try {

           if (conn == null){
               initConnection();
           }

             stmt =  conn.createStatement();

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

            stmt.execute(sql.toString());


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }


    public void deleteTable(){

        Statement stmt = null;
        try {

            if (conn == null){
                initConnection();
            }


             stmt =  conn.createStatement();

            String sql = "DROP TABLE student";

            stmt.execute(sql);



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void insertData(Student student){


        PreparedStatement ptmt = null;

        try {

            if (conn == null){
                initConnection();
            }

            String sql = "INSERT INTO student (create_at, update_at, name, QQ, classType, startTime, originalSchool, studentNo, dailyURL, wish, senior, knowingWay)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";


            ptmt = conn.prepareStatement(sql);
            ptmt.setLong(1,student.getCreate_at());
            ptmt.setLong(2,student.getCreate_at());
            ptmt.setString(3,student.getName());
            ptmt.setString(4,student.getQQ());
            ptmt.setString(5,student.getClassType());
            ptmt.setString(6,student.getStartTime());
            ptmt.setString(7,student.getOriginalSchool());
            ptmt.setString(8,student.getStudentNo());
            ptmt.setString(9,student.getDailyURL());
            ptmt.setString(10,student.getWish());
            ptmt.setString(11,student.getSenior());
            ptmt.setString(12,student.getKnowingWay());

            ptmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ptmt != null){
                try {
                    ptmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    public void deleteData(String name){


        PreparedStatement ptmt = null;

        try {

            if (conn == null){
                initConnection();
            }

            String sql = "DELETE FROM student WHERE name = ?";


            ptmt = conn.prepareStatement(sql);
            ptmt.setString(1,name);
            ptmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ptmt != null){
                try {
                    ptmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    public void updateData(String name,String newName){


        PreparedStatement ptmt = null;

        try {

            if (conn == null){
                initConnection();
            }

            String sql = "UPDATE student SET name = ? WHERE name = ?";


            ptmt = conn.prepareStatement(sql);
            ptmt.setString(1,newName);
            ptmt.setString(2,name);
            ptmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ptmt != null){
                try {
                    ptmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    public Student query(String name){


        PreparedStatement ptmt = null;
        Student student = new Student();
        try {

            if (conn == null){
                initConnection();
            }

            String sql = "SELECT * from student where name = ?";


             ptmt = conn.prepareStatement(sql);
            ptmt.setString(1,name);
           ResultSet rs = ptmt.executeQuery();

            while (rs.next()){
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
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ptmt != null){
                try {
                    ptmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

        return student;
    }


    public List<Student> queryAll(){

        Statement stmt = null;
        List<Student> students = new ArrayList<>();
        try {

            if (conn == null){
                initConnection();
            }

            String sql = "SELECT * from student";


            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
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
                students.add(student);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

        return students;

    }

}
