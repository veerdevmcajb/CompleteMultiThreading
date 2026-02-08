package com.veerdevmca.threads;

public class ATMThread extends Thread{

    private HDFCBank bankAccnt;
    ATMThread(HDFCBank bankAccnt){
        this.bankAccnt=bankAccnt;
    }
    @Override
    public void run() {

        try {
            bankAccnt.withdraw(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
