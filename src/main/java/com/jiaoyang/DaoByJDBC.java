package com.jiaoyang;

import java.sql.*;
import java.util.Properties;

public class DaoByJDBC {

    public static final String URL = "jdbc:mysql://localhost:3306/learn_java";
   // public static final String URL = "jdbc:mysql://localhost:3306/learn_java?useSSL=false&serverTimezone=GMT";
    public static final String USER = "root";
    public static final String PASSWORD = "password";





    public static void main(String[] args){

        try {

            Properties properties = new Properties();
            properties.setProperty("user","root");
            properties.setProperty("password","password");
            properties.setProperty("useSSL","false");
            properties.setProperty("serverTimezone","GMT");

            Class.forName("com.mysql.cj.jdbc.Driver");
          //  Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            Connection conn = DriverManager.getConnection(URL,properties);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()){
                System.out.println(rs.getString("姓名"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
