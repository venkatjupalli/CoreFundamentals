package com.core.java.java8.features;

import java.util.Comparator;

public class MyComp implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {

      //  return  (o1<o2)?1:(o1>02)?-1:0;
        if(o1<o2)
            return 1;
         else if(o1>o2)
                return -1;
         else return 0;
    }
}
