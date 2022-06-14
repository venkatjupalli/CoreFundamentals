package com.core.java.java8.features;

public class Employee {
    String empName;
    double salary;
    Employee(String empName,double salary){
        this.empName=empName;
        this.salary=salary;
    }
    public String toString(){
        return empName+":"+salary;
    }
}
