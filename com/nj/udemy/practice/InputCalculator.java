package com.nj.udemy.practice;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        long avg = 0;
        int loopcount = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Enter number ");
                String nextNum = scanner.nextLine();
                int number = Integer.parseInt(nextNum);
                sum = sum + number;
                loopcount ++;

            }catch (NumberFormatException e) {
                avg = Math.round((double)(sum) / loopcount);
                System.out.println(" Sum = " + sum + " AVG = " + avg);
                break;
            }


        }
    }
}