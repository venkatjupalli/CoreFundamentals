package com.core.java.oop;

import java.util.ArrayList;
import java.util.List;

class  Student{
    String name;
    int rollNum;
    public Student(String name,int rollNum){
        this.name=name;
        this.rollNum=rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }
}
class Teacher{
    String name;
    List<Student> st;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getSt() {
        return st;
    }

    public void setSt(List<Student> st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", st=" + st +
                '}';
    }
    public void m(){
        for (Student s:st
             ) {
            System.out.println(s);
        }
    }
}
public class TestAssociation {
    public static void main(String[] args) {
        Student s=new Student("student1",101);
       List<Student> stList=new ArrayList<>();
        Teacher t=new Teacher();
        t.setName("Teracher1");
        stList.add(s);
        t.setSt(stList);
        t.m();

    }
}
