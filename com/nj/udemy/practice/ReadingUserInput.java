package com.nj.udemy.practice;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x = 1;
        while (x <= 10) {
            System.out.print("Enter number #" + x + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                x++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum is " + sum);
        scanner.close();

    }

}
