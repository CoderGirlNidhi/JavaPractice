package com.nj.udemy.practice;

public class Expressions {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometeres = (100.00d * 1.609344d);
        System.out.println("The value of 100 miles in kilometers is = " + kilometeres);

        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression ");
        }

        // in the following code that is written below, write down what parts of teh code are expressions.

        int score = 100; // entire line is an expression except keyword - int and semicolon
        if (score > 99) { // part within brackets is also expression
            System.out.println("You got the high score !"); // part within brackets
            score = 0; // also expression
        }

    }
}
