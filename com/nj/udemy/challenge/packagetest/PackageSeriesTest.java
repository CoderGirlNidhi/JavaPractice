package com.nj.udemy.challenge.packagetest;

import com.nj.udemy.challenge.seriespackage.Series;

public class PackageSeriesTest {


    public static void main(String[] args) {

        for(int i = 0; i <= 10 ; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println(" **********************************************");

        for (int i = 0 ; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println(" **********************************************");

        for (int i = 0 ; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
