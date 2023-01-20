package com.nj.udemy.challenge.patterns;

public class Pattern4 {
        public static void main(String[] args) {
            starPattern4(5);
        }

        public static void starPattern4(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for(int k =1; k <= i ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
}
