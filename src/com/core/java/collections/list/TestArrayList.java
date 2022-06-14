package com.core.java.collections.list;

import com.core.java.bean.Student;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestArrayList  implements RandomAccess{
    public static void main(String[] args) throws CloneNotSupportedException {
        /*ArrayList<String> languages = new ArrayList<>();
        ArrayList<String> languages1 = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("languages size:"+languages.size());
        System.out.println("languages:"+languages);
        *//*for (String str:languages
             ) {
            if(!languages1.contains(str)){
                languages1.add(str);
            }
        }*//*
        for(int i=languages.size()-1;i>=0;i--){
            languages1.add(languages.get(i));
        }
        System.out.println("languages1:"+languages1);*/
       /* ArrayList<Student> studentList =null;
       studentList= new ArrayList<>();
        Student s=new Student(12,"A");
        Student s1=new Student(12,"A");
        //Student s1=(Student) s.clone();
        System.out.println(s.getRollno());
        //System.out.println(s1.getRollno());
        studentList.add(s);
       studentList.add(s1);
        //studentList.get(1);
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);
        String str = languages.get(1);
        System.out.println("Element at index 1: " + str);
        languages.set(2, "JavaScript");
        System.out.println(" languages list: " + languages);
        String strRemoved = languages.remove(2);
        System.out.println("Removed Element: " + strRemoved);

        if(studentList!=null && !studentList.isEmpty()) {
            System.out.println("if");
            int j=studentList.size(); //2
            for (int a=0;a<j;a++){
                studentList.add(s1);
                System.out.println(":::"+studentList.get(a));
            }
            for (Student sts:studentList
                 ) {
                System.out.println(sts);
            }
            Iterator<Student> it=studentList.iterator();
            while ( it.hasNext()){
              //  it.remove();
                System.out.println("usingf iteratoir:"+it.next());
            }
        } else {
            System.out.println("else");
        }
        for (String language : languages) {

            System.out.println(language);
        }
        Iterator<String> it=languages.iterator();
        while(it.hasNext()){
            String lang= it.next();
            System.out.println("Using iterator:"+lang);
        }

        ListIterator<String> lItr=languages.listIterator();
        while(lItr.hasNext()){
        System.out.println("using list iterator:"+lItr.next());
        }
*/
        /*ArrayList<Integer> arList=new ArrayList<>();
        System.out.println("ar list siz before:"+arList.size());

        for(int i=0;i<=10;i++){
            arList.add(i);
        }
        arList.add(11);
        for (int in:arList
             ) {
            System.out.println(in);
        }*/

     /*   ArrayList<Student> studentList = new ArrayList<>();
        Student s=new Student(20,"B");
        Student s1=new Student(10,"A");
        Student s2=new Student(30,"C");
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);
        System.out.println(studentList);
        Collections.sort(studentList);
        for (Student st:studentList
             ) {
            System.out.println(st);
        }*/
       // CopyOnWriteArrayList
        /*CopyOnWriteArrayList<Integer> ll=new CopyOnWriteArrayList<>();
        ll.add(1);
        ll.add(2);
        Iterator<Integer> itInt=ll.iterator();
        while(itInt.hasNext()){
            Integer iVal=itInt.next();
            System.out.println("value:"+iVal);
            ll.remove(1);
           *//* if(iVal.equals(2)){
                ll.remove(iVal);
            }else
                System.out.println("else");*//*
        }
        System.out.println(ll);*/

        ArrayList<String> languages = new ArrayList();
        ArrayList<String> languages1 = new ArrayList();
        languages.add("Java"); //0
        languages.add("Python"); //1
        languages.add("C");//2
        languages.add("C++");
      /*  languages.add("Java"); //3
        languages.add("Python");//4
        languages.add("C"); //5*/
        System.out.println("languages size:"+languages.size());
        System.out.println("languages:"+languages);
       /* for(int x=0;x<languages.size();x++){
            if(!languages1.contains(languages.get(x))){
                languages1.add(languages.get(x)); //java python c
            }
        }*/
      /* ArrayList<String> l= languages.stream().filter((c)->{
           ArrayList al=new ArrayList();
            languages.stream().filter(s -> ((!s.equals("C")) && (!(s.equals("C++"))))).collect(Collectors.toList());
        }).collect(Collectors.toList());*/
        ArrayList al=new ArrayList();
        languages.stream().forEach(
                c->{
                   if(!c.equalsIgnoreCase("C") && !c.equalsIgnoreCase("C++")){
                    al.add(c);
                   }
                }
        );
        System.out.println(al);
       /* for(int x=languages.size();x>=0;x--){
        System.out.println(languages.get(x));
        }*/
        System.out.println(languages);


       // Comparable

    }
}
