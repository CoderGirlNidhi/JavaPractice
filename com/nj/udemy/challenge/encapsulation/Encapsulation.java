package com.nj.udemy.challenge.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
//        Printer p = new Printer(80, 5 , false);
//        System.out.println(p);
        Printer p1 = new Printer(80, true);
        System.out.println("Initial Page count = " + p1.getPagesPrinted());

        int pagesPrinted = p1.printPages(5);
        System.out.printf("Current job pages : %d, Printer Total : %d %n" , pagesPrinted, p1.getPagesPrinted());

        pagesPrinted = p1.printPages(10);
        System.out.printf("Current job pages : %d, Printer Total : %d %n" , pagesPrinted, p1.getPagesPrinted());

//        p.addToner(70);
//        p.printPages(19);
//        System.out.println(p);
//
//        p.addToner(20);
//        p.printPages(-6);
//        System.out.println(p);
//
//        p.addToner(-6);
//        p.printPages(10);
//        System.out.println(p);
    }
}