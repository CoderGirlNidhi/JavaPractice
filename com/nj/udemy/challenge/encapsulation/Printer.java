package com.nj.udemy.challenge.encapsulation;

public class Printer {

    private int tonerLevel; // percentage how much toner is left
    private int pagesPrinted; //count of pages printed by printer // sheets printed
    private boolean duplex;  // if true, it can print 2 sides of single sheet paper


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;// this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100 ) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
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
