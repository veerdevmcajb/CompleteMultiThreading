package com.veerdevmca.threadpool;

public class TriggerEmailForPolicy implements Runnable{


    private Customer c;
    TriggerEmailForPolicy(Customer c){
        this.c=c;
    }

    @Override
    public void run() {
        triggerEmail(c);
    }

    public void triggerEmail(Customer c){
        System.out.println("Sending email to person");
       StringBuffer s=new StringBuffer();
       s.append("Hi "+ c.customerName);
       s.append(" for policy number "+ c.policyNumber +" premium is due and premium is "+ c.premium);
       s.append(" Please pay before the due date to avoid the late charges. ");
        System.out.println(s);
        // call the java mail API to trigger email

    }
}
