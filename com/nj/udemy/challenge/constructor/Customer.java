package com.nj.udemy.challenge.constructor;

public class Customer {

    String name;
    double creditLimit;
    String email;

    public Customer(){
        this("Nobody","default");
    }

    public Customer(String name, String email) {
        this(name,100,email);
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
