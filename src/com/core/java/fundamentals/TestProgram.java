package com.core.java.fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestProgram {
    int z=10;
    public TestProgram(){
    }
    public void method(){
        int age=20;
        System.out.println(age);
    }
    public void test(){
        int x=10;
        int y=20;
        System.out.println("add of 2 number:"+(x+y));
    }
    public static void main(String[] args) {
        TestProgram t = new TestProgram();
        t.test();
        System.out.println("welcome to java" + new TestProgram().z);
        t.method();
    }
}
