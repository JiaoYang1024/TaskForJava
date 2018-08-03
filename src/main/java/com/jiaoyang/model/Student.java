package com.jiaoyang.model;

import java.util.Date;

public class Student {

    private long create_at;
    private long update_at;
    private String name;
    private String QQ;
    private String classType;
    private String startTime;
    private String originalSchool;
    private String studentNo;
    private String dailyURL;
    private String wish;
    private String senior;
    private String knowingWay;


    public Student(){

        this.create_at = new Date().getTime();
        this.update_at = new Date().getTime();
       this.name = "";
       this.QQ = "";
       this.classType = "";
       this.startTime = "";
       this.originalSchool ="";
       this.studentNo ="";
       this.dailyURL ="";
       this.wish = "";
       this.senior = "";
       this.knowingWay = "";
    }


    public Student(String name, String QQ, String classType, String startTime, String originalSchool, String studentNo, String dailyURL, String wish, String senior, String knowingWay) {
        this.create_at = new Date().getTime();
        this.update_at = new Date().getTime();
        this.name = name;
        this.QQ = QQ;
        this.classType = classType;
        this.startTime = startTime;
        this.originalSchool = originalSchool;
        this.studentNo = studentNo;
        this.dailyURL = dailyURL;
        this.wish = wish;
        this.senior = senior;
        this.knowingWay = knowingWay;
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

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getOriginalSchool() {
        return originalSchool;
    }

    public void setOriginalSchool(String originalSchool) {
        this.originalSchool = originalSchool;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getDailyURL() {
        return dailyURL;
    }

    public void setDailyURL(String dailyURL) {
        this.dailyURL = dailyURL;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public String getKnowingWay() {
        return knowingWay;
    }

    public void setKnowingWay(String knowingWay) {
        this.knowingWay = knowingWay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "create_at=" + create_at +
                ", update_at=" + update_at +
                ", name='" + name + '\'' +
                ", QQ='" + QQ + '\'' +
                ", classType='" + classType + '\'' +
                ", startTime='" + startTime + '\'' +
                ", originalSchool='" + originalSchool + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", dailyURL='" + dailyURL + '\'' +
                ", wish='" + wish + '\'' +
                ", senior='" + senior + '\'' +
                ", knowingWay='" + knowingWay + '\'' +
                '}';
    }
}
