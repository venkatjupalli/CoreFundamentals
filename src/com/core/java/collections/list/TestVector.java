package com.core.java.collections.list;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector vv=new Vector(2);
        Vector v=new Vector(10);
        Vector v1=new Vector(10,2);
        System.out.println("Vector cap : "+vv.capacity());
for(int i=0;i<3;i++){
    vv.addElement(i);
}
        System.out.println("Vector cap : "+vv.capacity());
        System.out.println("Vector cap : "+vv.size());
        Vector<String> languages = new Vector();
        System.out.println("Vector cap : "+languages.capacity());
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.addElement("C++");
        System.out.println("Vector cap : "+languages.capacity());
        Iterator<String> iterate = languages.iterator();
        System.out.println("Vector: ");
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
