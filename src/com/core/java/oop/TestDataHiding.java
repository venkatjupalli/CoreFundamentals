package com.core.java.oop;


public class TestDataHiding {

   private String name ;
    private String address;
    private int rollNum;
    //String s="name";
    /////
   public TestDataHiding( ){

       //validate(pin/passw);

    }


    public TestDataHiding(String name){
        this.name=name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
/*public static void main(String[] args) {
        TestDataHiding t=new TestDataHiding("name");
        System.out.println(t.name);
    }*/

}
