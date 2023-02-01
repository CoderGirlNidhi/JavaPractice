package com.nj.udemy.practice.accessmodifiers;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AccessModifiers {

    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.calculateBalance();
//        timsAccount.transactions.add(5000);
        timsAccount.calculateBalance();
        timsAccount.deposit(500);
        timsAccount.withdraw(500000);
        timsAccount.deposit(-1000);
        timsAccount.withdraw(-500);
        timsAccount.calculateBalance();

        System.out.println("Balance on account is " + timsAccount.getBalance());
    }
}
