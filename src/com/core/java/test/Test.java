package com.core.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
     int x=0;
    int y=20;

    public static void main(String[] args) {

       /* int[] x=new int[2147483647];
        x[1]=10;
        System.out.println(x.length+":"+x[0]);
        System.out.println(x.getClass().getName());
        String[]  []x1=new String[2][2];
        System.out.println(x1.getClass().getName());

        int x2[][];

        int[] [] x3;

        int []x4[];

        Test t1=new Test();
        t1.x=100;
        t1.y=200;
        Test t2=new Test();

        System.out.println(t2.x+"---"+t2.y);*/

        String s="welcome";
        StringBuffer s2 = new StringBuffer();
        Arrays.asList(s).stream().forEach(
                str->{
                    for(int i=str.length()-1;i>=0;i--){
                         s2.append(String.valueOf(s.charAt(i)));
                    }
                    System.out.println(str);
                    System.out.println(s2);
                }

        );

        for (int i=s.length()-1;i>=0;i--
             ) {
            s2.append((s.charAt(i)));
        }
        System.out.println(s2);
        ArrayList<Integer> arl=new ArrayList<>();
        for(int i=0;i<=10;i++){
            arl.add(i);
        }
      /* List z= arl.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(z);
       List ax= arl.stream().filter(a->((a==3) || (a==5))).collect(Collectors.toList());
     List xx=  arl.stream().filter(
               a->{
                   return a==3 || a==5;
               }
       ).collect(Collectors.toList());*/
    ArrayList ay= (ArrayList) arl.stream().filter(filterValues()).collect(Collectors.toList());
    //   System.out.println(ax);
      //  System.out.println(xx);
        System.out.println(ay);
    }
    public static Predicate filterValues(){
    Predicate p=
            (arl1)->{

                return arl1.equals(3) || arl1.equals(5) ;
            };
       // Predicate x= (s)->s.equals(3) || s.equals(5);
        return p;
    }
}





