package com.core.java.methods;

import com.core.java.constructor.TestConstructor;
import com.core.java.test.Test;

//import java.time.Year;

public class TestDefaultMethods {

    public void method1(){
        System.out.println("welcome java");
        int x=10;
        int y=20;
        System.out.println(x+y);
    }

    public int method1(int y,int z){
        System.out.println("welcome java");
        return y+z;
    }
    public int method1(int y,String  x  ){
        System.out.println("welcome java");
        if(x.equalsIgnoreCase("venkat")){
         return   y+10;

        }else {
            return 0;
        }

    }
   /* public float method1(int y,int z,int x){
        System.out.println("welcome java");
        //return y+z;

    }*/
    public int x( int x){
        System.out.println("welcome");
        return  x*10;
    }

    public void method2(){
        System.out.println("");
    }
    public static void main(String[] args) {
        TestConstructor testConstructor=new TestConstructor(10,20,20);
        Student s=new Student();
        testConstructor.m();

/*
        TestDefaultMethods testDefaultMethods=new TestDefaultMethods();
        testDefaultMethods.method1();
       System.out.println(testDefaultMethods.method1(10));
        TestParameterizedMethods testParameterizedMethods=new TestParameterizedMethods();
       int x= testParameterizedMethods.method1(10,20);
       System.out.println(x);*/

    }
}



