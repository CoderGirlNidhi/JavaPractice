package com.nj.udemy.practice.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ItineraryFromTickets {

    public static String startPoint(HashMap<String, String> ticketsMap) {

        HashMap<String, String> revMap = new HashMap<>();
//        key-> key , value -> ticketsMap.get(key)
        for (String key : ticketsMap.keySet()) {
            revMap.put(ticketsMap.get(key), key); //        In revMap = here the key will be ticketsMap's value
        }

        for (String key : ticketsMap.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main (String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = startPoint(tickets);

        while(tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
