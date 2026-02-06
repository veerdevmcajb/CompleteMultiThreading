package com.veerdevmca.threads;

import java.sql.SQLOutput;

public class ThreadUsingRunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii "+ Thread.currentThread().getName());
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        // this is a way to create a Thread a object inside a Runnable interface
        ThreadUsingRunnableInterface tr=new ThreadUsingRunnableInterface();
        Thread t1 = new Thread(tr);
        t1.start();

        // this is a second way to create a thread .
        Thread t2=new Thread(new ThreadUsingRunnableInterface());
        t2.start();

        System.out.println("Main Ended");

    }
}
