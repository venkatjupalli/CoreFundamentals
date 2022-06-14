package com.core.java.java8.features;

public class TestT implements Inter{
    public void m() {
System.out.println("Test");
    }

    @Override
    public void m(int a, int b) {

    }

    @Override
    public void method() {
        Inter.super.method();
    }

    @Override
    public void method1() {
        Inter.super.method1();
    }
}
