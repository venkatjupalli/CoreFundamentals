package com.core.java.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet hs=new LinkedHashSet();
        hs.add("B");
        hs.add("C");
        hs.add("A");
        //hs.add("z");
       // hs.add(null);
        //hs.add(10);
        System.out.println(hs);
        //hs.add(10);
        TreeSet t1=new TreeSet(new CustomSorting());
        t1.addAll(hs);
        System.out.println(t1);
    }
}
