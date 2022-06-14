package com.core.java.threads;

class MyThread extends Thread{
 public void start1(){
     for (int i=0;i<2;i++){
         System.out.println("start methos for loop:"+i);
         run1(i);
     }

 }
    public void run1(int i){
        for (int j=0;j<i;j++){
            System.out.println("run methos for loop:"+j);
        }
    }
}
public class TestThread  {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
       // myThread.run();
        myThread.start();
        for (int i=0;i<2;i++){
            System.out.println("main methos for loop:"+i);
        }
    }
}
