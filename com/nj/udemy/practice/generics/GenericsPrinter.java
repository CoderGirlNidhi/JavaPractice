package com.nj.udemy.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPrinter {

    public static void main(String[] args) {

        Printer<String, Integer > printer = new Printer<> ("Nidhi");
        printer.print();

//        Printer<Double> printer1 = new Printer<>(33.5);
//        printer1.print();
//
//        Printer<String> printer3 = new Printer<>("Hi NIDHI");
//        printer3.print();

//        For arraylist, jst write the type in the angular brackets

//        ArrayList<Cat> cats = new ArrayList<Cat>();
//        cats.add(new Cat());
//        cats.add(new Dog()); This will throw error as it should be of type " CATS" only

//        If we make a cat class's object
//        Cat myCat = cats.get(0);

        shout("Nidhi" , 21);
        shout(45, "Gaurav");
        shout(44.7 , 45);
//        shout( new Cat());

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

//        List<Cat> catList = new ArrayList<>();
//        catList.add(3);
//        printList(catList);


    }

    // Generic Method
    private static <T , V> T shout(T thingToShout , V otherThings) {
        System.out.println(thingToShout + " !!!");
        return thingToShout;
    }

    private static void printList(List<?> myList) {
        System.out.println();
    }
}
