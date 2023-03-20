package com.nj.udemy.practice.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {

//        MyLinkedList<String> placesList = new MyLinkedList<>(); //declaration
        var placesList = new LinkedList<String>();
        placesList.add("Sydney");
        placesList.add(0, "California");
        placesList.addLast("Australia");
        placesList.addFirst("India");
        placesList.push("France");
        System.out.println(placesList);

//        addElements(placesList);
//        removeElements(placesList);
//        addElements(placesList);
//        gettingElements(placesList);
//        printItenary(placesList);
//        printItenary2(placesList);
//        printItenary3(placesList);
//        testIterator(placesList);
        testListIterator(placesList);

//        System.out.println("Index of France is " + placesList.indexOf("France"));
    }

    private static void addElements(LinkedList<String> placesList) {

//        QUEUE Methods
        placesList.offer("Singapore"); // offer last works same as add last, add elements to the last index
        placesList.offerFirst("UK");
        System.out.println(placesList);

//        Stack Methods
        placesList.push("Switzerland");
        placesList.push("Italy");
        placesList.push("Paris");
        placesList.addLast("Italy");

        System.out.println(placesList);
        System.out.println();
    }

    private static void removeElements(LinkedList<String> placesList) {

        System.out.println("Popped Element = " + placesList.pop());
        System.out.println(placesList);
        System.out.println();

        System.out.println("Removing element of index 4: " + placesList.remove(4));
        System.out.println(placesList);
        System.out.println();

//        Queue / deque poll methods
        String p1 = placesList.poll(); // removes first element
        System.out.println(p1 + " : First element p1 was removed");

        String p2 = placesList.pollFirst(); // removes first element
        System.out.println(p2 + " : First element removed using pollFirst() ");

        String p3 = placesList.pollLast(); // removes last element
        System.out.println(p3 + " Last element was removed using pollLast() ");
        System.out.println(placesList);

        System.out.println("Removes first element using pop():  " + placesList.pop()); //removes first element
        System.out.println(placesList);
        System.out.println();
        System.out.println();
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println(list);

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("India is at position : " + list.indexOf("India"));
        System.out.println("Italy is at position: " + list.lastIndexOf("Italy"));
        System.out.println("Italy is also at position : " + list.indexOf("Italy"));
        System.out.println();
        System.out.println(list);

//        Queue Retrieval Methods : FIFO
        System.out.println("Element from element() : " + list.element());
        System.out.println();

//        Stack Retrieval Methods : LIFO
        System.out.println("Element from peek() : " + list.peek());
        System.out.println("Elements from peekFirst() : " + list.peekFirst());
        System.out.println("Elements from peekLast() : " + list.peekLast());
        System.out.println();
        System.out.println();
        list.remove(list.size() - 3);
        System.out.println(list);
    }

    private static void printItenary(LinkedList<String> list) {
        System.out.println("Trip starts from : " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
//            System.out.print(" -> " + list.get(i));
            System.out.println("--From : " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at : " + list.getLast());
        System.out.println();
        System.out.println();
        System.out.println(list);
    }

    private static void printItenary2(LinkedList<String> list) {
        System.out.println("Trip starts from : " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--From : " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at : " + list.getLast());
        System.out.println();
        System.out.println();

    }

    private static void printItenary3(LinkedList<String> list) {
        System.out.println("Trip starts from : " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--From : " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at : " + list.getLast());
        System.out.println();
        System.out.println();

    }

    //      Iterator can only move forward and only supports remove method.
    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("India")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    //      ListIterator can move forward as well as backward. It supports 3 functions : Remove, Add, Set1 elements.
    private static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("India")) {
                iterator.add("Rajasthan");
            }
        }

        System.out.println(list);

//        This loop will not run after first while loop, if we need to run it ,
//        we have to call the listIterator method again fore hasNext, but we can move backward with hasPrevious method

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println();
        System.out.println(list);

        var iterator2 = list.listIterator(3);
//        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());


//        System.out.println(list);

    }
}


