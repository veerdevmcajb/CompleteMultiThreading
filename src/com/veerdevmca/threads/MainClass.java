package com.veerdevmca.threads;

public class MainClass {
    public static void main(String[] args) {
        HDFCBank veerAcc=new HDFCBank(7000);
        ATMThread ATM=new ATMThread(veerAcc);
        ATM.setName("Veer ATM Thread");

        GooglePay GooglePay=new GooglePay(veerAcc);
        GooglePay.setName("Veer GooglePay Thread");

        PhonePe Phonepe=new PhonePe(veerAcc);
        Phonepe.setName("veer Phonepe Thread");

        ATM.start();
        GooglePay.start();
        Phonepe.start();

        HDFCBank shivAcc=new HDFCBank(10000);
        ATMThread ATM1=new ATMThread(shivAcc);
        ATM1.setName("Shiv ATM Card");
        ATM1.start();

        PhonePe phonepe1=new PhonePe(shivAcc);
        phonepe1.setName("Shiv phonePay");
        phonepe1.start();

        GooglePay googlePay1=new GooglePay(shivAcc);
        googlePay1.setName("Shiv GooglePay");
        googlePay1.start();


        HDFCBank RamAcc=new HDFCBank(15000);
        ATMThread ATM2=new ATMThread(RamAcc);
        ATM2.setName("Ram ATM Card");
        ATM2.start();

        PhonePe phonepe2=new PhonePe(RamAcc);
        phonepe2.setName("Ram phonePay");
        phonepe2.start();

        GooglePay googlePay2=new GooglePay(RamAcc);
        googlePay2.setName("Ram GooglePay");
        googlePay2.start();

    }
}
