package com.core.java.oop;

public class Test {

    public static void main(String[] args) {
        TestParent p=new TestParent();
        System.out.println(p.a);
        TestParent p2=new TestParent();

        System.out.println(p2.a);
        TestChild c=new TestChild();
        TestParent p1=new TestChild();

        // p.m();
        //c.m();
        //p1.m();

    }

}
