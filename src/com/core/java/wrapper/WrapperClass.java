package com.core.java.wrapper;

import java.util.ArrayList;

//convert primitive data types into objects
//Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types
public class WrapperClass {
    public static void main(String[] args) {

        Integer aobj = null;
        ArrayList<Integer> list = new ArrayList();

        // create primitive types
        int a = 5;
        double b = 5.65;

        //converts into wrapper objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        //The instanceof operator checks whether an object is an instanceof a particular class.
        if(aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if(bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
        // converts into primitive types
        int a1 = aObj.intValue();
        double b1 = bObj.doubleValue();
        char c='a';
        System.out.println("The value of a: " + a1);
        System.out.println("The value of b: " + b1);


    }
}
