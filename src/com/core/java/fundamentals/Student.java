package com.core.java.fundamentals;

/*
 * Author:venkat R
 * Class:Student
 * Description: Demonstrate instance/static/local variables in java
 * */
public class Student {
    String name;

    int age=20;
    public  void method1(){
        System.out.println(age);

    }
    public static void main(String[] args) {
        //System.out.println(age);
        Student student=new Student();
        System.out.println(student.age);
    }
}
class Test{
    int x;
    double d;
    boolean b;
    String s;

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.x);
        System.out.println(t.d);
        System.out.println(t.b);
        System.out.println(t.s);
    }
}

 class InstanceVariablesDemo {
    static int age=20;
    public  void method1(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        //System.out.println(age);
        Student student=new Student();
        System.out.println(student.age);
        System.out.println(age);
    }
}
class InstanceVariablesDemo1{
    static int x;
    static double d;
    static boolean b;
    static String collName="TEST";

    public static void main(String[] args) {
        Test t=null;
        if(true) {
            System.out.println(t.x);
            System.out.println(t.d);
            System.out.println(t.b);
            System.out.println(t.s);
        }else {
            System.out.println(x);
            System.out.println(d);
            System.out.println(b);
        }
    }
}
