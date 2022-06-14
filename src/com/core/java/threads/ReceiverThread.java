package com.core.java.threads;

import java.time.LocalDate;

public class ReceiverThread implements Runnable{

    Message msg;
    public  ReceiverThread(Message msg){
     this.msg=msg;
    }
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        synchronized (msg){
            try {
                System.out.println("receiver waiting  at::"+ System.currentTimeMillis());
                msg.wait(1000);
            }catch (Exception e){

            }
            System.out.println("receiver notfied at::"+ System.currentTimeMillis());
            System.out.println("receiver notofied::"+ System.currentTimeMillis());
        }
    }
}
