package com.veerdevmca.threads;

public class HDFCBank {
    int accountBalance;

   public HDFCBank(int accountBalance){
        this.accountBalance=accountBalance;
    }

    synchronized public void withdraw (int withdrawalAmount) throws InterruptedException {
       while (accountBalance < withdrawalAmount){
           System.out.println("Insufficient balance..!"+Thread.currentThread().getName());
           wait();
       }
        accountBalance=this.accountBalance-withdrawalAmount;
        System.out.println(Thread.currentThread().getName() +" Withdraw successful "  + withdrawalAmount +" Current Balance is "+ accountBalance);
       // System.out.println("------------------------------------------------");

    }

   synchronized public void deposit(int depositAmount){
        accountBalance=this.accountBalance+depositAmount;
        System.out.println(Thread.currentThread().getName() + " Deposit Successful "+ depositAmount +" Current Balance is "+ accountBalance);
        notifyAll();
      // System.out.println("------------------------------------------------");
    }

    synchronized public void balanceCheck(){
        System.out.println(Thread.currentThread().getName() + " Balance is : "+ this.accountBalance);
   //     System.out.println("------------------------------------------------");
    }
}
