package com.jiaoyang.model;

import java.util.Date;

public class Employee {

    private int id;
    private long create_at;
    private long update_at;
    private String name;
    private String sex;
    private int age;
    private String job;



    public Employee(){

        this.create_at = new Date().getTime();
        this.update_at = new Date().getTime();
       this.name = "";
       this.sex = "";
       this.age = 0;
       this.job = "";

    }


    public Employee(String name, int age, String sex, String job) {
        this.create_at = new Date().getTime();
        this.update_at = new Date().getTime();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }

    public long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(long create_at) {
        this.create_at = create_at;
    }

    public long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "create_at=" + create_at +
                ", update_at=" + update_at +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
