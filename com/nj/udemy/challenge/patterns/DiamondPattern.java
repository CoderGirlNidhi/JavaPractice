package com.nj.udemy.challenge.patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        diamondP(10);
    }

    public static void diamondP(int n) {
        for(int i=1 ; i <= n; i++) {
            for(int j=1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n - 1 ; i++) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= n - i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
