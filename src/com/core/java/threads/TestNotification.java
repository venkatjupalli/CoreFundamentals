package com.core.java.threads;

public class TestNotification {
    public static void main(String[] args) {
        Message m=new Message("Process");
        ReceiverThread rt=new ReceiverThread(m);
        new Thread(rt,"receiver").start();
        ReceiverThread rt1=new ReceiverThread(m);
        new Thread(rt1,"receiver1").start();
        Sender s=new Sender(m);
        new Thread(s,"sender").start();
        System.out.println("completed");
    }
}
