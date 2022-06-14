package com.core.java.java8.features;

public class Student {
    String studentName;
    int rollNum;
    Student(String studentName,int rollNum){
        this.studentName=studentName;
        this.rollNum=rollNum;
    }
    public String toString(){
        return studentName+":"+rollNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
