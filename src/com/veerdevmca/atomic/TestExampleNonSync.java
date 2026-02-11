package com.veerdevmca.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TestExampleNonSync {
   // static int count=0;
static AtomicInteger count=new AtomicInteger(0);
    public static void main(String[]args) throws InterruptedException {

       Thread t1=new Thread(()->{
           for(int i=0;i<1000;i++){
               count.incrementAndGet();
               //count++;
           }
       });

       Thread t2=new Thread(()->{
           for(int i=0;i<1000;i++){
              count.incrementAndGet();
               // count++;
           }
       });
       t1.start();
       t2.start();
       t1.join();
        System.out.println(count);

    }
}

// it will solve a race case condition .
// how it will work steps
//    1)Read current value
//      2) compair with expected value
//      3) if same -> update
//      4) if not-> retry
//  faster performance.
// WHEN NOT TO USE ATOMICINTEGER
// -when multiple variables must be updated together.
//