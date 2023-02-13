package com.nj.udemy.practice.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

//        Insert
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);

        System.out.println("Size of set is " + hs.size());

//        Search
        if(hs.contains(1)) {
            System.out.println("Set1 contains 1");
        }
        if(!hs.contains(6)) {
            System.out.println("does not contain");
        }

//        Delete/Remove

        hs.remove(1);
        if(!hs.contains(1)) {
            System.out.println("Does not contain 1 - we deleted one");
        }

        System.out.println(hs);
        hs.add(4);

//        Iterator
//        for (int i = 0; i< n ; i++)

        Iterator it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
