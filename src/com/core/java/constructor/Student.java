package com.core.java.constructor;

public class Student {
    String name;
    int rollNum;
    public Student() {
        System.out.println("Default constructor of Student class");
    }
    public Student(String name, int rollNum) {
       // this();
        this("",123,20);
        this.name = name;
        this.rollNum = rollNum;
    }
    public Student(String name, int rollNum,int x) {
        this.name = name;
        this.rollNum = rollNum;
        System.out.println("");
    }
    public Student(Student s){
        this.name=s.name;
        this.rollNum=s.rollNum;
    }

    public String getName() {
        return name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public static void main(String[] args) {
        Student s1=new Student("xyz",123);
        Student s2=new Student("abc",234);
       // Student s=new Student()
        System.out.println(s1.name+"--"+s1.rollNum);
        System.out.println(s2.name+"--"+s2.rollNum);
    }
}
