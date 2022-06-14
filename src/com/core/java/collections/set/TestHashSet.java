package com.core.java.collections.set;

import java.util.*;

public class TestHashSet {

    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("B");
        hs.add("C");
        hs.add("A");
       // hs.add("z");
        //hs.add(null);
       // hs.add(10);
       // hs.add(100);
        System.out.println(hs.add("A"));
        System.out.println(hs.add("X"));
        //hs.add(null);
        System.out.println(hs);
        TreeSet t1=new TreeSet(new CustomSorting());
        t1.addAll(hs);
        System.out.println(t1);

    }
}


