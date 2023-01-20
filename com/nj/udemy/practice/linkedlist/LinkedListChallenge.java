package com.nj.udemy.practice.linkedlist;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Scanner;


record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);

    }
}
public class LinkedListChallenge {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Place> placesList = new LinkedList<>();
//        Place adelaide = new Place("Adelaide", 1374);
        addPlaces(placesList, new Place("Adelaide", 1374));
        addPlaces(placesList, new Place("Brisbane", 917));
        addPlaces(placesList, new Place("Perth", 3923));
        addPlaces(placesList, new Place("Alice Spring", 2771));
        addPlaces(placesList, new Place("Darwin", 3972));
        addPlaces(placesList, new Place("Melbourne", 817));

        placesList.addFirst(new Place("Sydney", 0));

        System.out.println(placesList);

        var iterator = placesList.listIterator();
        boolean quitLoop = false;
        boolean forward = true;
        printMenus();

        while(!quitLoop) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }

            if(!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = sc.nextLine().toUpperCase();
            switch(menuItem) {
                case "F" :
                    System.out.println("User wants to go forward");
                    if(iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B" :
                    System.out.println("User wants to go backward");
                    if(iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println("User wanst to look at the places to go");
                    System.out.println(placesList);
                    break;
                case "M" :
                    System.out.println("User wants to look at the menu");
                    printMenus();
                    break;

                default : quitLoop = true;
                break;
            }
        }


    }

    private static void addPlaces(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found Duplicate : " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPLace : list) {
            if (place.distance() < listPLace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenus() {
        String textblock = """
                Available action (Select word or letter) :
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";

        System.out.println(textblock + " ");
    }
}

