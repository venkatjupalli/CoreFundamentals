package com.core.java.methods;

// this key word feature with instance variable
public class TestWithInstanceVariablesMethod {
    int x=10;
    int y=20;
 void m(int x,int y){
     System.out.println(x+y);
 }
    static void m1(int x,int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        TestWithInstanceVariablesMethod t=new TestWithInstanceVariablesMethod();
        t.m(100,200);
        m1(1,2);
    }
}
