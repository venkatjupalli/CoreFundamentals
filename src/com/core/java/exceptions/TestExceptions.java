package com.core.java.exceptions;

import java.io.IOException;

class  CustoException extends  RuntimeException{
    CustoException(String msg){
       // System.out.println(msg);
        super(msg);
    }
    //customized exception
}

public class TestExceptions {
    static void withdraw(int withDrawamount){
        try{
        int balance=100;
        if(withDrawamount>balance){
            throw new CustoException("Insufficient balance");
        }}catch(Exception e){

            }
    }

    //default exception handler
    public static void main(String[] args) {

        System.out.println("Exception");
        //int x = 10;
        String s=null;
        //System.out.println(s.length());
        try {
            // create database connecti
           // System.out.println("div:" + (x / 0));
          //  System.out.println(Integer.parseInt("ten"));
          //all some logic for our requiremnts
            withdraw(1000);
        //throw new NumberFormatException("number format bexception test exception");
        }
       /*catch (NullPointerException e){

        }catch ( Exception e){
            //throw  new NumberFormatException("number format bexception");
        }*/
        finally {

            //System.out.println("in finally");
        }
        System.out.println("test");
    }

}

// finaly{} final and finalize() method