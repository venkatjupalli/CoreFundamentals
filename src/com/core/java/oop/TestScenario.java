package com.core.java.oop;

public class TestScenario {
    /*static {
        System.out.println("static block: ");
        {
            System.out.println("instance block: ");
        }
    }
     {
        System.out.println("instance block: ");
    }*/
    public static void main(String[] args){
// name amount pin

        TestDataHiding t=new TestDataHiding();
        // System.out.println(t.name);
       t.setName("x");
        System.out.println(t.getName());

      //  TestScenario t=new TestScenario();
// Create an object of class B.
      /*  B obj = new B();
       // A a=obj;
        System.out.println("Value of a: " +obj.b);
        System.out.println("Value of b: " +B.a);
        // Create an object of class B.
        System.out.println("Value of a: " +B.a);

        System.out.println("Value of b: " +obj.b);
      //  obj.show();
        obj.display();*/
    }
}
