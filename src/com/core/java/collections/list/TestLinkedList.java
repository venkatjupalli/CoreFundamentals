package com.core.java.collections.list;

import com.core.java.bean.Student;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
    public static void main(String[] args) {
        Student s=new Student(10,"A");
        Student s1=new Student(10,"B");
        Student s2=new Student(10,"C");
        Collection c=new LinkedList();
        c.add(s);
        c.add(s1);
        c.add(s2);
        LinkedList l=new LinkedList();
        l.add(s); //0
        l.add(s1); //1st
        l.add(null);
       // l.addAll(c);
        System.out.println(l.size());
        System.out.println(l.get(0).toString());
        System.out.println(l);
        l.add(1,s2);
        System.out.println(l.get(0).toString());
        System.out.println(l);
        System.out.println(l);
        System.out.println(l.get(0).toString());
        System.out.println(l.get(1).toString());
        //System.out.println(l.get(1).toString());
        /*System.out.println(l);
        System.out.println(l.pop().toString());
        System.out.println(l);

        for (Object student:l
             ) {
            Student st=(Student) student;
        System.out.println(st);
        }
        Iterator iterator=l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/




    }
}
