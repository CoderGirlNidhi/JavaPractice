package com.nj.udemy.challenge;

public class Factorial {

    public static void main(String[] args) {
        int factorial = 5;
        System.out.println("Factorial of " + factorial + " is " + calculateFactorialIterative(factorial));
        System.out.println("Factorial of " + factorial + " is " + calcFactorialRecursive(factorial));
    }

    public static int calculateFactorialIterative(int n) {
        //input validation
        if (n < 1 || n > 20) {
            System.out.println("Number not in range !! ");
            return -1;
        }
        int fact = 1;
        //Factorial by Iteration method:
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int calcFactorialRecursive(int n) {
        // Input Validation
        if (n > 20 || n < 1) {
            return -1;
        }
        // Break Condition
        if (n == 1) {
            return 1;
        }
        // Recursive Call
        return n * calcFactorialRecursive(n - 1);
    }
}
