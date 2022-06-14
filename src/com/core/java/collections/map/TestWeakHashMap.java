package com.core.java.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

public class TestWeakHashMap {
    public static void main(String[] args) throws Exception{
        HashMap w=new HashMap();
       // WeakHashMap w=new WeakHashMap<>();
        Temp t=new Temp();
        w.put(t,"session");
        System.out.println(w);
        t=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println(w);
    }
}

class Temp{
    public String toString(){
        return "demo";
    }
    public void finalize(){
        System.out.println("finalize method");
    }
}

