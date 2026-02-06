package com.veerdevmca.threads;

public class PhonePe extends Thread{

    private HDFCBank bankAcc;

    public PhonePe(HDFCBank bankAcc){
        this.bankAcc=bankAcc;
    }

    @Override
    public void run() {
        bankAcc.balanceCheck();
    }
}
