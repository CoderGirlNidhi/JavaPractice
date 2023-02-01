package com.nj.udemy.challenge.seriespackage;

public class Series {

    public static void main(String[] args) {
        System.out.println("Sum = " + nSum(10));
        System.out.println("Factorial = " + factorial(10));
        System.out.println("Fibonacci = " + fibonacci(10));
    }

    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
//         return n * (n + 1) / 2;
    }

    public static long factorial(int n) {
        int fact = 1;
        for(int i = n; i >= 1 ; i-- ) {
            fact = fact * i;
        }
        return fact;
    }

    public static int fibonacci(int n) {
        // Input Validation
        if(n < 0) return -1;

        // Break Condition
        if(n < 2) {
            return n;
        }

        // Recursive Call
        // f(n) = f(n-1) + f(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
