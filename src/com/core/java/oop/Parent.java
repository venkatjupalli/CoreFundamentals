package com.core.java.oop;

public class Parent {

//public String name="parent";
    public void m1()
    {
        m2();
        System.out.println("parent class method-m1()");
    }
    public  void test(){
        System.out.println("test method");
    }
    /*public static void classMethod()
    {
        System.out.println("classMethod in Parent class");
    }
    public void instanceMethod()
    {
        System.out.println("instanceMethod in Parent class");
    }*/
    public void m2(){
        System.out.println("parent");
    }

    public static void main(String[] args) {
        Parent p=new Parent();
        p.m2();
    }
}
