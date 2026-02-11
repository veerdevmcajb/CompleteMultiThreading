package com.veerdevmca.synchronize;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    private static final int NUM_THREADS=5;

    private static Semaphore semaphore=new Semaphore(2);

    public static void main(String[] args) {
        for(int i=1;i<=NUM_THREADS;i++){
            Thread t=new Thread(new Worker(i));
            t.start();
        }
    }

    private static class Worker implements Runnable{
        private int id;

        public Worker(int id){
            this.id=id;
        }

        @Override
        public void run() {
            try {
                System.out.println("Thread "+id + " is waiting for a permit.");
                semaphore.acquire();
                System.out.println("Thread "+id + " has acquired a permit.");
                Thread.sleep(1000);
                semaphore.release();
                System.out.println("Thread "+ id + " has release a permit");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
