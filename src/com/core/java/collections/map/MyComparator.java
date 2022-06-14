package com.core.java.collections.map;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        /*String s=(String)o1;
        String s1=(String)o2;
        return s1.compareTo(s);*/
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;
        if(i2>i1){
        return 1;
        }else if (i2<i1){
            return -1;
        }else
            return 0;
    }
}
