package com.core.java.oop;


public class TestInterface implements Interf{
  /*  public void m1() {
        //logic
    }

    public void lawan() {
    }

   void m6(){
  }*/

    public void l1(){
    }
   /* public void m1() {
        //logic
    }*/
    public static void m8(){
        //imp
    }
   /* public void lawan() {
    }*/

    public static void main(String[] args) {
      /*  TestInterface t=new TestInterface();
        t.l1();
        t.lawan();
        TestInterface.m8();
        Interf.m8();*/
       Interf test = () -> {
            System.out.println("test");
        };
       System.out.println(test.toString());

    }


    @Override
    public void m1() {

    }
}
