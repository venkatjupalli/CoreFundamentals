package com.core.java.fundamentals;

  class TestClass1 {


      String gender="name";
      int gender1=1;
      String name;

   /* static
    non 0static
        --- local
      ---- instance */
      public void method(){
          String address;

      }

    public static void main(String[] args) {
        System.out.println("Hello welcome to Java");
        HelloWorld helloWorld=new HelloWorld();

    }




}


class Students{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor

    Students(int r,String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of static variable
public class TestClass{
    public static void main(String args[]){
        Students s1 = new Students(111,"Karan");
        Students s2 = new Students(222,"Aryan");
        s1.display();
        s2.display();
    }
}
