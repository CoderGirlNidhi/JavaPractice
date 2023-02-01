package com.nj.udemy.practice.generics;

public class Printer <T , V> { //If we want to extend 1 class and multiple inheritances = Printer <T extends Cats & Player>

//    Integer thingsToPrint;
    T thingsToPrint;
    V otherThing;


    public Printer(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }



    public void print() {
        System.out.println(thingsToPrint);
    }

}
