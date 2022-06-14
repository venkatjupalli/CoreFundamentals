package com.core.java.oop;

public abstract class Employee {
    private String name;
    private int id;
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    // Declaration of concrete method.
    void m1()
    {
        System.out.println("Name: " +name);
        System.out.println("Id: " +id);
    }
}
