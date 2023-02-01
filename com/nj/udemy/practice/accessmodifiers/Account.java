package com.nj.udemy.practice.accessmodifiers;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance =balance + amount;
            System.out.println(amount + " is added in the account and new balance is " + this.balance);
        }else {
            System.out.println("Cannot deposit negative nos");
        }
    }

    public void withdraw(int amount) {

        if (amount > this.balance) {
            System.out.println("Insufficient balance. Cannot withdraw money !!");
        } else {
            int withdraw = -amount;
            if (withdraw < 0) {
                this.transactions.add(withdraw);
                this.balance += withdraw;
                System.out.println((amount + " withdrawan. Balance is now " + this.balance));
            } else {
                System.out.println("Cannot withdraw with negative sums ");
            }
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(int i : this.transactions) {
            this.balance +=i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
