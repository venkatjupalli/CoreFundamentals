package com.core.java.collections.map;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        Map m=new IdentityHashMap();
      /*  m.put(1,"name");
        m.put(1,"test");
       // m.put(null,null);
       // m.put(null,1);
        m.put("name",1);
        m.put(1,1);
        System.out.println( m.get("name"));
        System.out.println(m.remove(10));
       // m.clear();
       System.out.println(m.containsKey(1));
      System.out.println(  m.containsKey(10));
      m.containsValue(1);
      m.size();
      m.isEmpty();
        *//*System.out.println(m.put(1,"name"));
        System.out.println(m.put(1,"test"));
        System.out.println(m.put(1,"test1"));*//*

        System.out.println(m);
        Set set=  m.entrySet();
        Iterator it=set.iterator();
        while (it.hasNext()){
        Map.Entry m1=(Map.Entry) it.next();
        //System.out.println(m1.getKey());
          //  System.out.println(m1.getValue());
            if(m1.getKey().equals("name")){
                m1.setValue("update");
            }
        }
        System.out.println(m);*/
        //System.out.println(m.put(1,"test"));
      /*  System.out.println(m.put(1,1));
        System.out.println(m.put(1,2));
        System.out.println(m.put(null,2));
        System.out.println(m.put(null,3));
        System.out.println(m.put(null,null));
        System.out.println(m.put(null,null));
        System.out.println(m.put(2,null));

        System.out.println(m.get(2));
        System.out.println(m.containsValue(null));
        System.out.println(m);*/

       /* m.put("C",10);
        m.put("B",20);
        m.put("A",10);
        m.put("D",30);*/
        //System.out.println(m);
       // System.out.println(m.put("A",50));
       /* Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();*/
       // System.out.println(m);

        /*Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        Integer i3=10,i4=10;

        m.put(i3,"A");
        m.put(i2,"B");*/
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        Integer i3=i2;
        System.out.println(i1==i2); // false
        System.out.println(i1.equals(i2));//true
        m.put(i1,"A");
        m.put(i2,"B");
        m.put(i3,"C");
        System.out.println(m);

    }
}
