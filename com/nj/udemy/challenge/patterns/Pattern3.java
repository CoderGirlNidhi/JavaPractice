package com.nj.udemy.challenge.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        starPattern3(5);
    }

    public static void starPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k =1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}