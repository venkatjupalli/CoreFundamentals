package com.core.java.oop;

public class TestAbstration {
    public static void main(String[] args) {
       // Addition a = new Addition();
        /*Addition a1 = new Addition();
        Addition a3=a;*/
       /* System.out.println("a :"+a.hashCode());
        System.out.println("a1:"+a1.hashCode());
        System.out.println("a3::"+a3.hashCode());*/

        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        //a.calculate(20, 30);
        s.calculate(10, 5);
        m.calculate(10, 20);
       // a.m3();
        s.m3();

    }
}
