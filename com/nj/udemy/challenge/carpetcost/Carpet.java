package com.nj.udemy.challenge.carpetcost;

public class Carpet {
    private final double  cost;

    public Carpet(double cost) {
        this.cost = Math.max(0, cost);
    }

    public double getCost() {
        return this.cost;
    }
}
