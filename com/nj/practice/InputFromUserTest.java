package com.nj.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputFromUserTest {
    public static final int MAX_ELEMENTS_TO_KEEP = 5;
    private final List<Integer> list;
    private final Map<Integer, Integer> map;

    public InputFromUserTest() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    private boolean addNumber(final int n) {
        if (list.size() == MAX_ELEMENTS_TO_KEEP) {
            int val = list.remove(0);
            map.remove(val);
        }

        if (map.containsKey(n)) {
            return false;
        }
        map.put(n,-1);
        if (!list.isEmpty()) {
            int indexToUpdate = list.size() - 1;
            int valToUpdate = list.get(indexToUpdate);
            map.put(valToUpdate, n);
        }
        return list.add(n);
    }

    private int getNextNumber(final int n) {
        return map.getOrDefault(n, -1);
    }

    private void print () {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("List: ");
        for (int nums : list) {
            System.out.print(nums + ", ");
        }
    }

    private void startProgram() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter one of the options (a/g/p/q): ");
            String input = sc.nextLine();
            switch (input) {
                case "a" -> {
                    try {
                        System.out.print("Enter a no you want to add: ");
                        int add = Integer.parseInt(sc.nextLine());
                        boolean t = addNumber(add);
                        System.out.println("Number successfully added in the list: " + t);
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid integer no only. " + e.getMessage());
                    }
                }
                case "g" -> {
                    try {
                        System.out.print("Enter integer value to get the next number from database: ");
                        int get = Integer.parseInt(sc.nextLine());
                        int nextNo = getNextNumber(get);
                        System.out.println("Next no of " + get + " is " + nextNo);
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid integer no only. " + e.getMessage());
                    }
                }
                case "q" -> {
                    System.out.println("GoodBye");
                    return;
                }
                case "p" -> print();
                default -> System.out.println("Unknown character");
            }
        }
    }

    public static void main(String[] args) {
        final InputFromUserTest obj = new InputFromUserTest();
        System.out.println("Program Started.");
        obj.startProgram();
        System.out.println("\nProgram Ended.");
    }
}
