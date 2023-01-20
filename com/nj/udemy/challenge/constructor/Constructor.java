package com.nj.udemy.challenge.constructor;

public class Constructor {
    public static void main(String[] args) {



        Customer c1 = new Customer("Nidhi", 1000, "nidhi@gmail.com" );

        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmail());

        Customer c2 = new Customer();
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmail());

        Customer c3= new Customer("Joey","joey@gmail.com");
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
        System.out.println(c3.getEmail());



    }
}