package com.core.java.threads;

public class Sender implements  Runnable{
    Message msg;
    public Sender(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        String name=Thread.currentThread().getName();
        System.out.println(name+":started");
            try {
                Thread.sleep(1500);
                synchronized (msg){
                    msg.setMsg(name+":Notified");
                    msg.notifyAll();
                }
            }catch (Exception e){

            }
            System.out.println("receiver notofied::"+ System.currentTimeMillis());

    }
}
