package com.nj.udemy.challenge.autoboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit); // Auto-boxing

    }
}

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase");
        bank.status = Bank.Status.COOKING;
        bank.addNewCustomer("GD" , 1000);
        System.out.println(bank);

        Customer c2 = new Customer("GD", 5000);
        bank.addNewCustomer("GD", 5000);
        bank.addTransactions("GD" , -100);
        bank.printStatement("GD");

        Customer c1 = new Customer("ND" , 1000);
        bank.addNewCustomer("ND", 1000);
        bank.addTransactions("ND", -10.75);
        bank.addTransactions("ND", 100);
        bank.addTransactions("GD", -75.01);
        bank.printStatement("ND");

    }
}