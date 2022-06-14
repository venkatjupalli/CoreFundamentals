package com.core.java.test;

public final class TestSingleTon {

    private  static TestSingleTon testSingleTon=null;
    private TestSingleTon(){
        System.out.println("singleton");
    }
    public static TestSingleTon  getInstance(){
        if(testSingleTon==null){
            testSingleTon=new TestSingleTon();
        }else{
            return testSingleTon;
        }
        return testSingleTon;
    }
    public static void main(String[] args) {

        TestSingleTon t= getInstance();
        TestSingleTon t1= getInstance();
        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());
    }
}
