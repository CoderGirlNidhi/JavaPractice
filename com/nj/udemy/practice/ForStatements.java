package com.nj.udemy.practice;

public class ForStatements {
    public static void main(String[] args) {

      //  System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for(int i =2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0 , i )));
           // System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0 , i ));

            System.out.println("**************************************************************");


        }
        for(int j = 8; j >1 ; j--) {
            System.out.println("10,000 at " + j + "% interest = " + String.format("%.2f",calculateInterest(10000.0 , j )));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }
}