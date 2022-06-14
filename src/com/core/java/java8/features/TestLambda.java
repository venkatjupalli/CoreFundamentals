package com.core.java.java8.features;

import com.core.java.oop.InterF1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambda {



    public void m(){
        System.out.println("test");
    }
    /*public void m1(int a,int b){
        System.out.println(a+b);
    }
    public void square(int a){
        System.out.println(a*a);
    }
*/
   /* a->{
        System.out.println(a*a);
    }
     a->{
        return a*a;
    }
    (a,b)->{
        System.out.println(a+b);
    }
   ()->{System.out.println("test"); }*/




    public static void main(String[] args) {
        TestLambda d=new TestLambda();
        //d.m();

     //   ()->{System.out.println("test"); }

        Inter t =(a,b) -> System.out.println("Test"+(a+b));
        /*Inter t1=()->{
            System.out.println("Test");
        }*/
        //System.out.println(t);
       // t.m(10,20);
        t.method();
        Inter.mm();
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(8);
        list.add(20);
        list.add(15);
        System.out.println(list);

        String[] st={"A","AA","B","BB"};
        Predicate<String> pr=  (s)->s.length()>1 && s.startsWith("A");
       for(String s:st){
           if(pr.test(s)){
               System.out.println(s);
           }
       }

       /* Predicate<Integer> p=i->i%2==0;


        for (Integer i:list
             ) {
            if(p.test(i)){

            }else{

            }
           // System.out.println(p.test(i));
        }*/

        Comparator<Integer> c=(a,b)->(a<b)?1:(a>b)?-1:0;
        Collections.sort(list,c);
        System.out.println(list);
    }

    /*public static boolean test(Integer i){
        if(i%2==0){
            return true;
        }else{
        return  false;
        }
    }*/
}
