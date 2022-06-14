package com.core.java.oop;

public class Child extends Parent {

    public String name="child";
    public void m2()
    {
        super.m2();
        //System.out.println(super.name);
        System.out.println("Child class method-m2()");
    }
    public void m(){
        System.out.println("Child class method-m1()");
    }

    public static void main(String[] args) {
        Child c=new Child();
        Parent p=new Parent();


    }
    /* public Child(){
        super();
    }
    void ownFeature()
    {
        System.out.println("Feature C");
    }*/

   /* public static void classMethod()
    {
        System.out.println("classMethod in Child class");
    }
    public void instanceMethod1()
    {
        System.out.println("instanceMethod in Child class");
    }*/

}
