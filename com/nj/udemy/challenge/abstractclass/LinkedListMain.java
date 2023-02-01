package com.nj.udemy.challenge.abstractclass;

public class LinkedListMain {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

//        String stringData = "Darwin Brisbane Perth  Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 7 6 1 0 4 6";

        String[] data = stringData.split(" ");
//        for(String s : data ) {
//            list.addItem(new Node(s));
//        }

        list.traverse(list.getRoot());

    }

//    2
}
