package com.veerdevmca.deadlock;

public class Thread2WithDeadLockSolution extends Thread {

    Object obj1=null;
    Object obj2=null;

    Thread2WithDeadLockSolution(Object obj1, Object obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public void run() {
        System.out.println("Thread 1 is about acquiring the lock on object 1");
        synchronized (obj1){
            System.out.println("Thread 1 is acquiring the lock on object 1 ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is trying to acquiring the loc on object ");
            synchronized (obj2){
                System.out.println("Thread 1 trying to acquiring the lock on object 1");
            }

            System.out.println("Thread 1 has release the lock on object 1");
        }
    }
}
