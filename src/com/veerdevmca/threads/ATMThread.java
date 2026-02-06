package com.veerdevmca.threads;

public class ATMThread extends Thread{

    private HDFCBank bankAccnt;
    ATMThread(HDFCBank bankAccnt){
        this.bankAccnt=bankAccnt;
    }
    @Override
    public void run() {

        bankAccnt.withdraw(4000);

    }
}
