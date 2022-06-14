package com.core.java.oop;

public class TestInnerClass {

    private String s="test";
    class InnerClass{
        private String s="test inner";
        public void test(){
            System.out.println("welcome");
            class Test{
                void m(){
                    System.out.println("welcome to iner class of inner");
                }
            }
            Test t=new Test();
            t.m();
        }
    }

    public static void main(String[] args) {
        TestInnerClass t=new TestInnerClass();
        TestInnerClass.InnerClass obj=t.new InnerClass();
        obj.test();
    }
}
