package com.core.java.test;

import java.util.*;

public class SampleTest {
    ArrayList arl=new ArrayList<>();
    public void Demo ()

    {

        int a = 0;

        int b = a + 5;

        System.out.println("B value is: " + b);

    }
    public void Demo1 (int a,int b)

    {


        int c = a + b;

        System.out.println("B value is: " + c);

    }
// whats the output
    public static void main (String args [])

    {
        SampleTest obj = new SampleTest ();
       // obj.Demo1(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        TestSingleTon t=TestSingleTon.getInstance();
        TestSingleTon t1=TestSingleTon.getInstance();
        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());
    }

    //
  /*  public static void main ( String args [] )

    {
        int a;
        system.out.println("Variable value is" + a );

    }*/


}

