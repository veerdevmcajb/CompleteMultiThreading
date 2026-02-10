package com.veerdevmca.synchronize;

public class SynchronizedExample  {

    synchronized void display(SynchronizedExample d){
        System.out.println("HI..1");
        System.out.println("HI..2");
        System.out.println("HI..3");
    }

     void display1(SynchronizedExample d){
         System.out.println("hi..1");
         System.out.println("hi..2");
         synchronized (d){
             System.out.println("hi...3");
             System.out.println("hi...4");
         }
    }

    public static void main(String[] args) {
        //class implements Runnable
        SynchronizedExample s=new SynchronizedExample();

        //lambda expression
        Runnable l1=()->{
            s.display(s);
        };

        Thread t=new Thread(()->s.display(s));

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                s.display1(s);
            }
        });
        t.start();
        t1.start();

    }
}
