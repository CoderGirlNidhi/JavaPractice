package com.nj.udemy.challenge.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        starPattern2(5);
    }

    public static void starPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
