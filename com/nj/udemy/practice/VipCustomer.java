package com.nj.udemy.practice;

public class VipCustomer {

   private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Defalult name", 50000, "default@gamil.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
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

    public static void main(String[] args) {

        VipCustomer nidhi = new VipCustomer();
        System.out.println(nidhi.getName() + " " + nidhi.getCreditLimit() + " " + nidhi.getEmail());

        VipCustomer gaurav = new VipCustomer("Gaurav", 1000);
        System.out.println(gaurav.getName() + " " + gaurav.getCreditLimit() + " " + gaurav.getEmail());

        VipCustomer Rashmi = new VipCustomer("Rashmi", 2000, "rashmi@gmail.com");
        System.out.println(Rashmi.getName() + " " + Rashmi.getCreditLimit() + " " + Rashmi.getEmail());

    }
}
