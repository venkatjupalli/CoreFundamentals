package com.core.java.collections.list;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> languages = new Stack();
        System.out.println("Stack cap : "+languages.capacity());
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        //languages.push("C++");
        System.out.println("Stack cap : "+languages.capacity());
        System.out.println(languages.pop());
        Iterator<String> iterate = languages.iterator();
        System.out.println("Stack: ");
      /*  while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }*/
    }
}
