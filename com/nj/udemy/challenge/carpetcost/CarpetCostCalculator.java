package com.nj.udemy.challenge.carpetcost;

public class CarpetCostCalculator {
    public static void main(String[] args) {

        Floor floor = new Floor(2.75, 4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("total= " + calculator.getTotalCost());

        floor = new Floor(5.4, 4.5 ); // re-assignment of local variable
        carpet = new Carpet(1.5 );
        calculator = new Calculator(floor,carpet);
        System.out.println("total= " + calculator.getTotalCost());



    }
}