package com.core.java.oop;

public class AbstractClassWithContructor extends Employee {

    public AbstractClassWithContructor(String name, int id)
    {
        super(name, id); // This statement is used to call super class constructor.
    }
    public static void main(String[] args)
    {
// Creating an object of the subclass of abstract class.
        AbstractClassWithContructor e = new AbstractClassWithContructor("venkat", 10000);
        e.m1();
    }
}
