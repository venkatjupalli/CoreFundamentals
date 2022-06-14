package com.core.java.oop;

public class A {
    // Declare an instance variable and initialize value 10.
    int a = 10;
    // Declare a default constructor.
    A(){
        System.out.println("Class A constructor");
    }
    // Declare a static block.
    static{
        System.out.println("Class A SIB");
    }
    {
        System.out.println("Class A IIB");
    }

    // Declare an instance variable, static variable and initialize values.
    static int b = 30; // Static variable.
    private void show()
    {
        System.out.println("Static method of class A");
    }
    static void display()
    {
        System.out.println("Non-static method of class A");
    }
}
