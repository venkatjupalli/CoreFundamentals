package com.core.java.fundamentals;

/*
 * Author:venkat R
 * Class:Modifiers
 * Description: Demonstrate Modifiers in java
 * */
 public class Modifiers {
    public void m(){
        System.out.println("Method m");
    }

    /*void m(){
        System.out.println("Method m");
    }*/
    public static void main(String[] args) {
        Modifiers m=new Modifiers();
        m.m();
        TestEnum enums=TestEnum.FEB;
    }
}
