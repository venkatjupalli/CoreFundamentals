package com.core.java.test;

import java.util.HashMap;
import java.util.Objects;

class Student{
    private String name;
   // private int age;
    Student(String name){
     //   this.age=age;
        this.name=name;
    }
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }*/

    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +'}';
    }
}
public class TeshHashMap {
    public static void main(String[] args) {
        Student s=new Student("venkat");
        Student s1=new Student("venkat");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.equals(s1));
        HashMap<Student,String> hm=new HashMap<>();
        hm.put(s,"A");
        hm.put(s1,"B");
        System.out.println(hm);
    }

}
