package com.nj.udemy.challenge.autoboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {

    enum Status {
        UNDEFINED,
        SHOPPING,
        EATING,
        STORAGE,
        COOKING,
        OTHER
    }

    private String name;

    public  Bank.Status status = Status.UNDEFINED;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {

        for(var customer : customers) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("CustomerConstructor (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {

        if(getCustomer(customerName) == null ) {
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customers.add(newCustomer);
            System.out.println("New CustomerConstructor Added: " + newCustomer);
        }
    }

    public void addTransactions(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    //Unboxing
    public void printStatement(String customerName) {

        Customer customer = getCustomer(customerName);
        if(customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("CustomerConstructor Name " + customer.name());
        System.out.println("Transactions: ");
        for(double d : customer.transactions()) { //Unboxing
            System.out.printf("$%10.2f (%s)%n" , d, d < 0 ? "debit" : "credit");
        }

    }
}
