package com.nj.udemy.practice;

public class MinutesToYearDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if( minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long days = minutes / 1440;
        long y = days / 365;
        long d = days % 365;
        System.out.println(minutes + " min = " + y + " y and " + d + " d");
    }
}


