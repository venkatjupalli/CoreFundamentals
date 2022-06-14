package com.core.java.threads;


import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

public class TestThreads {

    public static void main(String[] args) throws InterruptedException {
        Instant i=Instant.now();
        System.out.println(i);
        Timestamp time=new Timestamp(System.currentTimeMillis());
        Instant ins=time.toInstant();
        System.out.println(ins);
        Table tt=new Table();
        T tt1=new T(tt);
        T tt2=new T(tt);
        tt1.start();
        tt2.start();
        Thread t = new Thread();
        Thread t1 = new Thread();
        // t.start();
        //t1.start();
        System.out.println(t.getName());
        System.out.println(t1.getName());

/*
        Runnable r = () -> System.out.println("welcome");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside run");
            }
        });
        //t2.start();
        Thread t3 = new Thread(r);
       // t3.start();
        new Thread(() -> System.out.println("venkat")).start();
        t1.start();
        try {
            t1.join(1000);
        } catch (InterruptedException ie){
    }

        t2.start();
        try {
            t1.join();
            t2.notify();
        } catch (InterruptedException ie){
        }

        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ie){
        }*/
    }

}
class T extends Thread{
    Table t;
    T(Table t){
        this.t=t;
    }
   /* public void run(){
        t.m1();
    }*/
}
class Table{
    synchronized public void m1(){
        try {
            System.out.println("welcome");
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

}
