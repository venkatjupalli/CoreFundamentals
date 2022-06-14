package com.core.java.collections.set;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(null);
     /*  t.add("A"); //  A
       t.add("X"); //x x.compareTo("A")  x hass to come after  a yes positive 1
        // x has before a  -1
        // eaues/same  0

        t.add("Z"); //z.compateTo(A); pos
        //z.compareTo(X) :
        t.add("B"); //B.CompateTo("A") //
        //B.CO(X)*/
       /* t.add(10);
        t.add(0);
        t.add(20);
        t.add(15);*/
     /*   t.add("A"); //1 a
        t.add("ABC"); //3
        t.add("AA");//2
        t.add("xx");//2
        t.add("ABCD");//4
        t.add("A");//1*/
        System.out.println(t);
    }
}

//z,X,B,A