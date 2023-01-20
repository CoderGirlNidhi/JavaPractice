package com.nj.udemy.challenge.patterns;

public class DiagonalStarChallenge {
    public static void main(String[] args) {
        printSquareStar(8);

    }

    public static void printSquareStar(int n) {
        if(n < 5) {
            System.out.println("Invalid Value");
        }
        for( int i = 1; i <= n ; i++) {
            for(int j = 1; j <= n ; j++) {

                if( i == 1 || i == n ) {
                    System.out.print("*");
                } else if (j == 1 || j == n ) {
                    System.out.print("*");
                } else if ( i == j) {
                    System.out.print("*");
                } else if (j == n - i +1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
