package com.veerdevmca.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HDFCBank {

    public static void main(String[] args) {
        HDFCBank k=new HDFCBank();
        Thread t1=new Thread(()->k.deposit(1000)); // Thread creating using lambda
        Thread t2=new Thread(()->k.withDraw(1000));
        Thread t3=new Thread(()->k.balanceInquiryFromUPI());
        Thread t4=new Thread(()->k.balanceInquiryFromMobileApp());
        Thread t5=new Thread(()->k.balanceInquiryFromNetBanking());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    double amount=0;
    ReentrantReadWriteLock l=new ReentrantReadWriteLock();

    void deposit(double depositAmt){
//        Lock l1=l.writeLock();
//        l1.lock();

        l.writeLock().lock();
        amount=amount+depositAmt;
        l.writeLock().unlock();
    }

    void withDraw(double withdrawtAmt){
//        Lock l1=l.writeLock();
//        l1.lock();

        l.writeLock().lock();
        amount=amount-withdrawtAmt;
        l.writeLock().unlock();
    }

    void balanceInquiryFromUPI(){
        l.readLock().lock();
        System.out.println("Balance is "+ amount);
        l.readLock().unlock();
    }

    void balanceInquiryFromNetBanking(){
        l.readLock().lock();
        System.out.println("Balance is "+ amount);
        l.readLock().unlock();
    }

    void balanceInquiryFromMobileApp(){
        l.readLock().lock();
        System.out.println("Balance is "+ amount);
        l.readLock().unlock();
    }

}
