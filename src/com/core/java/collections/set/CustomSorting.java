package com.core.java.collections.set;

import java.util.Comparator;

public class CustomSorting implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        String i1=(String) o1;
        String i2=(String) o2;
    if(i1.length()>i2.length()){
        return 1;
    }else
    return 0;


        /*String s1=(String)o1;
        String s2=(String)o2;
        return s2.compareTo(s1);
                //s2.compareTo(s1);*/
    }

}
