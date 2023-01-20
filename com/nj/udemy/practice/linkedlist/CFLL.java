package com.nj.udemy.practice.linkedlist;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class CFLL {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        int size= list.size();
        System.out.println(size);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.remove(3);
        System.out.println(list);

    }

}
