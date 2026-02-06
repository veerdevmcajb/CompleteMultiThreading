package com.veerdevmca.threads;

public class ThreadExample extends Thread{
    ThreadExample(String msg){
        super(msg);
    }

    public static void main(String[] args) {

        System.out.println("main Started");
        ThreadExample t1=new ThreadExample("Shiv"); // we can set name from here also but we have to create a constructor
        ThreadExample t2=new ThreadExample("veer");

        t1.setName("Tilak");
        t2.setName("Kishan");

        t1.start();
        t2.start();

        System.out.println("main ended");
    }

    @Override
    public void run() {
        System.out.println("Hi..."+ Thread.currentThread().getName());
        System.out.println("Hello...");
    }
}
