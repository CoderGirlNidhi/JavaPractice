package com.nj.udemy.challenge;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calculate(6, -10));
        System.out.println(calculate(100));
      //  System.out.println(calculate_2(67));
     //   System.out.println(calculate_3(67));
        System.out.println((int) 100.8 % 12);
    }

    public static double calculate(double f, double i) {
        if (f >= 0 && (i >= 0 && i <= 12)) {
            return ((f * 12) + i) * 2.54;
        }
        System.out.println("Invalid Input");
        return -1;
    }

    public static double calculate(double input) {
        if (input >= 0) {
            double f = Math.floor(input / 12);
            double i = input - (f * 12);
            System.out.println("Feet: " + f + ", Inches: " + i);
            return calculate(f, i);
        }
        return -1;
    }

    public static double calculate_2(double input) {
        if (input < 0) {
            return -1;
        }

        double f = Math.floor(input / 12);
        double i = input - (f * 12);
        System.out.println("Feet: " + f + ", Inches: " + i);
        return calculate(f, i);
    }

    public static double calculate_3(int input) {
        if (input < 0) {
            return -1;
        }

        int f = input / 12;
        int i = input % 12;
        System.out.println("Feet: " + f + ", Inches: " + i);
        return calculate(f, i);
    }
}
