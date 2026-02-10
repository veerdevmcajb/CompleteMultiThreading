package com.veerdevmca.deadlock;

public class MainClass {

    public static void main(String[] args) {
        Object ob1=new Object();
        Object ob2=new Object();
        Thread1 t1=new Thread1(ob1,ob2);
       // Thread2 t2=new Thread2(ob1,ob2);
        t1.start();
        //t2.start();

        Thread2WithDeadLockSolution t2=new Thread2WithDeadLockSolution(ob1,ob2);
        t2.start();

    }
}
