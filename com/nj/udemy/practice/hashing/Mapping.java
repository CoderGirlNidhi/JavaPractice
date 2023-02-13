package com.nj.udemy.practice.hashing;

import java.util.*;

public class Mapping {
    public static void main(String[] args) {
//        Country(Kye), population(value)
//        Creation:
        HashMap<String, Integer> map = new HashMap<>();

//        Insertion :
        map.put("India" , 120);
        map.put("US" , 30);
        map.put("China" , 150);

        System.out.println(map);

        map.put("China" , 180);
        System.out.println(map);

//        Look-Up / Search
        if(map.containsKey("Indonesia ")) {
            System.out.println("Key is present in the map");
        }else {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("India")); //key exists
        System.out.println(map.get("UK")); //key doesn't exists

//        For-each loop   -for (int i : a)
//        Printing 1)Through Entry set
        System.out.println();
        System.out.println("Printing through Entry Set");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(" " + e.getValue());
            System.out.println();
        }

//        2)Through KeySet
        Set<String> keys = map.keySet();
        System.out.println();
        System.out.println("Printing through KeySet");
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }

//        Delete/Remove
        System.out.println();
        map.remove("China");
        System.out.println(map);

//        Size of Map
        System.out.println(map.size());

    }
}
