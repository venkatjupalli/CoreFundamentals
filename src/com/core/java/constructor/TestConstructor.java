package com.core.java.constructor;

import com.core.java.bean.Employee;

public class TestConstructor {
    int x=10;
    int y=20;
public void TestConstructor(){
}
    TestConstructor(int x,int y){
      this.x=x;
      this.y=y;
      System.out.println(x+"--"+y);
    }
    public TestConstructor(int x,int y,int z){
        this.x=x;
        this.y=y;
        System.out.println(x+"--"+y);
    }
    public TestConstructor(TestConstructor testConstructor){
    this.x=testConstructor.x;
    }
    public void m(){

    }
    public static void main(String[] args) {
        Employee e=new Employee();
        Employee e1=new Employee();
       // Student student=new Student();
     /*   System.out.println(e.getEmpName());
        System.out.println(e.getCompanyName());
        System.out.println(e.getAge());
        System.out.println(e1.getEmpName());
        System.out.println(e1.getCompanyName());
        System.out.println(e1.getAge());*/
        Student s=new Student("Name",123);
        Student s1=new Student(s);
        System.out.println(s1.name+""+s1.rollNum);
    }
}
