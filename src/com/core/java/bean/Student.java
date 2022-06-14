package com.core.java.bean;

import java.util.RandomAccess;

public class Student implements Comparable<Student> {

    private int rollno;
    private String name;

    public Student(){

    }
    public Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }
   /* public Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
      //  int res=this.name.compareTo(o.getName());
     return this.name.compareTo(o.getName());
    }
}
