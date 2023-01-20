package com.nj.udemy.challenge;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("The area of Circle is " + area(5));
        System.out.println("The area of Rectagle is " + area(6,6));
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }

        double areaOfCircle = Math.PI * radius * radius;
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if( x < 0 || y < 0) {
            return -1;
        }

        double areaOfRec = x * y;
        return areaOfRec;
    }
}