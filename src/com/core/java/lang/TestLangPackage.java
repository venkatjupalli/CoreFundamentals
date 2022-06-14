package com.core.java.lang;

import java.security.Key;
import java.util.*;

class Student{
   private String name;
    String collName;


   @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", collName='" + collName + '\'' +
                '}';
    }
}
public class TestLangPackage {
    public static void main(String[] args) {
        final StringBuffer sb=new StringBuffer("venkat");
        sb.append("R");
        System.out.println(sb);
        sb.append("one");
        String s=new String("s");
        String s1="s";
        String asda=new String("venkat");

       final Student ss=new Student();
      /*  final String coslleName="xyz";
        String s=new String("venkat");
        String s1=new String("venkatR");
        System.out.println(s1.hashCode());
        //String s="venkat";
        System.out.println(s.hashCode());
        s =s.concat("R"); venkatr
        System.out.println(s);
        System.out.println(s.hashCode());
        //System.out.println(s.concat("R"));*/


       // String s=new String("venkat");
      /*  String s="venkat";
        String s1="venkat";*/
       /* System.out.println("s::"+s.hashCode()+":"+s);
        System.out.println("s11::"+s11.hashCode()+":"+s11);*/
       /* System.out.println("s ==:"+(s==s1));
        System.out.println("sequals:"+s.equals(s1));
        System.out.println("sequals:"+s.equalsIgnoreCase(s1));
        System.out.println("s::"+s);

        Student st=new Student();
        System.out.println(st.toString());*/

       /* StringBuffer sb=new StringBuffer("venkat");
        System.out.println("sb:"+sb.hashCode()+":"+sb);
        sb.append("raman");
        System.out.println(sb);
        System.out.println("sb:"+sb.hashCode()+":"+sb);
*/
        StringBuffer sb1=new StringBuffer("venkat");
        StringBuffer sb2=new StringBuffer("R");
        StringBuffer sb3=sb1;

      /*  System.out.println("sb2:"+sb2.hashCode());
        System.out.println("sb3:"+sb3.hashCode());
*/
        System.out.println("s::"+sb1.equals(sb2));
        System.out.println("s::"+sb1.equals(sb3));

       /* s=s.concat("Ramana");
        System.out.println("s::"+s.hashCode()+":"+s);


        String s1="venkat";
        String s2="venkat";
        System.out.println("s1:"+s1.hashCode());
        System.out.println("s2:"+s2.hashCode());
        System.out.println("s ==:"+(s1==s2));
        System.out.println("sequals:"+s1.equals(s2));

==

        StringBuffer sb1=new StringBuffer("venkat");
        StringBuffer sb2=new StringBuffer("venkat");
        StringBuffer sb3=sb1;
        System.out.println("sb1:"+sb.hashCode());

        System.out.println("sb2:"+sb2.hashCode());
        System.out.println("sb3:"+sb3.hashCode());

        System.out.println("s::"+s1.equalsIgnoreCase(s2));

        System.out.println("sb::"+sb1.equals(sb2));
        System.out.println("sb::"+sb1.equals(sb3));*/

        String str="madam is soo hot aaa";
        String[] strAr= str.split(" ");
        HashMap h=new HashMap();
        StringBuffer sb11=null;
        for (int i=0;i<strAr.length;i++){
            sb11=new StringBuffer();
            String sRev=strAr[i];
           for(int j=sRev.length()-1;j>=0;j--){
               sb11=sb11.append(sRev.charAt(j));
           }
           System.out.println(strAr[i]+"-"+sb11);
           System.out.println(strAr[i].equalsIgnoreCase(sb11.toString()));
           if(strAr[i].equalsIgnoreCase(sb11.toString())){
               h.put(strAr[i].length(),strAr[i]);
           }
        }
        Set set=h.entrySet();
        Iterator itr=set.iterator();
        Set l=new HashSet();
        while (itr.hasNext()){
            Map.Entry mapEn=(Map.Entry) itr.next();
            System.out.println(mapEn.getKey()+":"+mapEn.getValue());
        }
        //Object key = Collections.max(h.entrySet(), Map.Entry.comparingByValue()).getKey();
        //System.out.println(h.get(key));
    }
}
