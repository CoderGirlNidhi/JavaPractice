package com.nj.udemy.challenge.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        starPattern5(6);
    }
    public static void starPattern5(int n) {
        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= n + 1 - i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
