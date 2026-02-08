package com.veerdevmca.threadpool;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingForInsurance {
    public static void main(String[] args) {


        Customer c1 = new Customer("Kartik", "PL1234", 100000);
        Customer c2 = new Customer("Amey", "PL1235", 200000);
        Customer c3 = new Customer("Natha", "PL136", 150000);
        Customer c4 = new Customer("Akash", "PL137", 250000);
        Customer c5 = new Customer("Nilesh", "PL138", 300000);
        Customer c6 = new Customer("Vijay", "PL139", 100000);
        Customer c7 = new Customer("Shubham", "PL140", 105000);
        Customer c8 = new Customer("Shiv", "PL1241", 70000);

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);
        customerList.add(c6);
        customerList.add(c7);
        customerList.add(c8);

        ExecutorService ex= Executors.newFixedThreadPool(3);

        for(int i=0;i<customerList.size();i++){
            TriggerEmailForPolicy t=new TriggerEmailForPolicy(customerList.get(i));
            ex.execute(t);
        }

    }

}
