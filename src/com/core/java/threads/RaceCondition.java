package com.core.java.threads;

class  Counter implements Runnable{
    private int c = 0;
    public  volatile int num=0;
    public final transient int x=0;
    public  void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        c++;
    }

    public  void decrement() {
        c--;
    }

    public  int getValue() {
        return c;
    }
    @Override
    public void run() {
        synchronized(this){
            // incrementing
            this.increment();
            System.out.println("Value for Thread After increment "
                    + Thread.currentThread().getName() + " " + this.getValue());
            //decrementing
            this.decrement();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName()
                    + " " + this.getValue());
        }
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Thread t1=new Thread(c,"T1");
        Thread t2=new Thread(c,"T2");
        Thread t3=new Thread(c,"T3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        System.out.println(t1.isAlive());
    }
}

/*T1:before:0
        T1after::1
        T3:before:1
        T3after::2
        T2:before:2
        T2after::3*/

/*
T3:before:0
        T1:before:0
        T1after::2
        T2:before:0
        T2after::3
        T3after::1*/
/*
Value for Thread After increment T1 1
        Value for Thread at last T1 0
        Value for Thread After increment T2 1
        Value for Thread at last T2 0
        Value for Thread After increment T3 1
        Value for Thread at last T3 0*/

/*
Value for Thread After increment T2 3
        Value for Thread After increment T3 3
        Value for Thread at last T3 1
        Value for Thread After increment T1 3
        Value for Thread at last T1 0
        Value for Thread at last T2 2*/
