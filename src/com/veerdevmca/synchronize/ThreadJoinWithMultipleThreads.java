package com.veerdevmca.synchronize;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadJoinWithMultipleThreads {

    static CountDownLatch c=new CountDownLatch(10);
    public static void main(String[] args) throws InterruptedException {

        ExecutorService ex= Executors.newFixedThreadPool(3);

        for(int i=0;i<10;i++){
            ex.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println("Hi "+Thread.currentThread().getName());
                    c.countDown();
                }
            });

        }
        c.await();
        System.out.println("hi..");
    }
}
