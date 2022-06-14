package com.core.java.fundamentals;
/*
Class name:
Purpose:
AUthor:
date:
version:1
version :2 author :
change: changes in methosds or any change derfiniatio of methods

**/

//  class nme:
//

//import java.util.Objects;

public class HelloWorld {

     String name="JAVA";
    static String gender="m";
    public  void test(){
        System.out.println("name :"+name);
        System.out.println(name.hashCode());
        //String name="test string";
        System.out.println("gender :"+gender);
        System.out.println(gender.hashCode());
        gender="xxx";
        System.out.println("gender ---:"+gender);
        System.out.println(gender.hashCode());
        System.out.println("name:"+name);
        System.out.println(name.hashCode());
        System.out.println("str:"+name);
    }
    public  void m1(){
        gender="xxx";
    System.out.println(name);
    }


     public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorld();
       /* System.out.println("Hello Welcome to Java");
        System.out.println("main method gender:"+HelloWorld.gender);
         System.out.println(helloWorld.name);*/
        // System.out.println(hw.name);
        // helloWorld.test();
    }

   /* public static void main1(String[] args) {
        System.out.println("Hello Welcome to Java111");
    }
    public static void main() {
        System.out.println("Hello Welcome to Java without arg params");
    }

    public void main(String args) {
        System.out.println("Hello Welcome to Java with string param" );
    }
*/
}

class a{
    public int number;
    public int number1;

    @Override
    public String toString() {
        return "a{" +
                "number=" + number +
                ", number1=" + number1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        a a = (a) o;
        return number == a.number && number1 == a.number1;
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(number, number1);
    }*/
}

