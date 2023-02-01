package com.nj.udemy.practice.statickeyword;

public class StaticTest {

    public static void main(String[] args) { // Only a static method can call the other static methods and can use static variables

        Static instance1 = new Static("Instance One");
        System.out.println(instance1.getName() + " is instance number " + Static.getCount());

        Static instance2 = new Static("Instance Two");
        System.out.println(instance2.getName() + " is instance number " + Static.getCount());

        Static instance3 = new Static("Instance Three");
        System.out.println(instance3.getName() + " is instance number " + Static.getCount());


    }
}
