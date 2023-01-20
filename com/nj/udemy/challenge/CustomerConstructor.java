package com.nj.udemy.challenge;

public class CustomerConstructor {

    String name;
    double creditLimit;
    String email;

    public CustomerConstructor(){
        this("Nobody","default");
    }

    public CustomerConstructor(String name, String email) {
        this(name,100,email);
    }
    public CustomerConstructor(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public static void main(String[] args) {
        CustomerConstructor c1 = new CustomerConstructor("Nidhi", 1000, "nidhi@gmail.com" );
        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmail());

        CustomerConstructor c2 = new CustomerConstructor();
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmail());

        CustomerConstructor c3= new CustomerConstructor("Joey","joey@gmail.com");
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
        System.out.println(c3.getEmail());
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
