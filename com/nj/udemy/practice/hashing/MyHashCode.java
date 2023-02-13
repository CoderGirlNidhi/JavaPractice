package com.nj.udemy.practice.hashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MyHashCode {
    static class MyHashMapCode<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        public MyHashMapCode() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchMyLL(K key, int bi) {
            LinkedList<Node> list = buckets[bi];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")

        private void rehashing() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchMyLL(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                System.out.println("Key already exists, and Value is updated");
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lamda = (double) n / N;
            if (lamda >= 2.0) {
                rehashing();
            }
        }

        public boolean containKey(K key) {
            int bi = hashFunction(key);
            int di = searchMyLL(key, bi);

            if (di == -1) {
                System.out.println(key + " - Key doesn't exist");
                return false;

            } else { //Key exists
                System.out.println(key + " - Key exists");
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchMyLL(key, bi);

            if (di == -1) {
                System.out.println(key + " - Key doesn't exist");
                return null;

            } else { //Key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchMyLL(key, bi);

            if (di == -1) {
                return null;

            } else { //Key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }


    public static void main(String[] args) {
        MyHashMapCode<String, String> map = new MyHashMapCode<>();
        map.put("India", "New Delhi");
        map.put("United States", "Washington DC");
        map.put("United Kingdom", "London");
        map.put("Canada", "Ottawa");

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        System.out.println();

        map.put("India", "Delhi");

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        System.out.println();

        map.containKey("Indonesia");
        map.containKey("India");
        System.out.println();

        System.out.println("Removing UK " + map.remove("United Kingdom"));
        keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

    }
}
