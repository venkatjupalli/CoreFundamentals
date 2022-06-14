package com.core.java.collections.list;

import com.core.java.bean.*;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCollection {

    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        Collection c= new ArrayList();
      /*  Parent p=new  Child();
        Child c=new Parent();invalid*/
        Student[] stObj=new Student[10];
        stObj[0]=new Student();
        stObj[1]=new Student();
       // stObj[2]=new Employee();
        int x=10;
        int y=20;
        int z=30;
        List l=new ArrayList();
        ArrayList <Boolean> ar=new ArrayList();
        ar.add(true);
        ar.add(false);


        ArrayList a=null;
        String s22=null;
                int xx;
        //--------creating like this 100000
        int []obj=null;
        obj=new int[2];
        obj[0]=10;
        obj[1]=20;
        String[] st=new String[10];
        for (int in:obj
             ) {
            System.out.println(in);
        }

        List<Integer> lObj=new ArrayList();
        lObj.add(10);
        lObj.add(20);
        lObj.add(30);
        lObj.add(40);

        Iterator<Integer> i=lObj.listIterator();
        while(i.hasNext()){
            Integer in=  i.next();
            if(in.equals(10)){
                System.out.println("-------");
                lObj.remove(in);
            }
        }
        System.out.println(lObj);

    }
}
