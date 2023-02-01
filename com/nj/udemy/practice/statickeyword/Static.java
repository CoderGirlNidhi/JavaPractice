package com.nj.udemy.practice.statickeyword;

public class Static {

//    private int count = 0; // associated with object
     private static int count = 0 ; //class variable , do not need any object to call this,
//     it will be created just 1 time in memory during class loading and will be shared with all the objects
    private String name;

    public Static(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
