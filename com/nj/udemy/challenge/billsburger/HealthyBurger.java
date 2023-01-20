package com.nj.udemy.challenge.billsburger;

class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super(meat, price);
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name += name;
        healthyExtra1Price += price;
        System.out.printf("Added %s for an extra %.2f %n", healthyExtra1Name, healthyExtra1Price);

    }

    public void addHealthyAddition2(String name, double price) {
        System.out.printf("Added %s for an extra %.2f %n", healthyExtra1Name, healthyExtra1Price);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }
}


