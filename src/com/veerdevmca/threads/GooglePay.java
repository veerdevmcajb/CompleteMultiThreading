package com.veerdevmca.threads;

public class GooglePay extends Thread{

    private HDFCBank bankAccnt;
    public GooglePay(HDFCBank bankAccnt){
        this.bankAccnt=bankAccnt;
    }

    @Override
    public void run() {

        bankAccnt.deposit(5000);
    }
}
