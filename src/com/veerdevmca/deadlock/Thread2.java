package com.veerdevmca.deadlock;

public class Thread2 extends Thread{
    Object obj1=null;
    Object obj2=null;
    Thread2(Object obj1, Object obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public void run() {
        System.out.println("Thread 2 is about acquiring the lock on object 2");
        synchronized (obj2){
            System.out.println("Thread 2 is acquiring the lock on object 2 ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is trying to acquiring the loc on object 1");
            synchronized (obj1){
                System.out.println("Thread 2 trying to acquiring the lock on object 1");
            }

            System.out.println("Thread 2 has release the lock on object 1");
        }
    }
}
