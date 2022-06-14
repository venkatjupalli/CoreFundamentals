package com.core.java.collections.map;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap t=new TreeMap(new MyComparator());
        //t.put(null,1);
        t.put(2,2);
        t.put(1,1);
        t.put(3,3);
        t.put(4,null);
       // t.put("one",1);
        /*t.put("X",1);
        t.put("A",1);
        t.put("D",1);
        t.put("B",1);*/
        System.out.println(t);
    }
}
