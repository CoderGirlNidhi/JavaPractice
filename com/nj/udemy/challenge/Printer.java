package com.nj.udemy.challenge;

public class Printer {

    private int tonerLevel; // percentage how much toner is left
    private int pagesPrinted; //count of pages printed by printer // sheets printed
    private boolean duplex;  // if true, it can print 2 sides of single sheet paper


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;// this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100 ) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

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

    public int addToner(int tonerAmount) {
        if(tonerAmount + tonerLevel > 100 || tonerAmount + tonerLevel < 0 ) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        if(pages < 0 ){
            System.out.println("Pages number invalid. ");
            return -1;
        }
        if(duplex) {
            int pagesToPrint = pages / 2 + pages % 2;
            pagesPrinted += pagesToPrint;
            return pages;
        } else {
            pagesPrinted += pages;
        }
        return pages;
    }

    public int printPages2(int pages) {
        if(pages < 0 ){
            System.out.println("Pages number invalid. ");
            return -1;
        }
        int pagesToPrint = pages;
        if(duplex) {
            pagesToPrint = pages / 2 + pages % 2;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;

    }
}
