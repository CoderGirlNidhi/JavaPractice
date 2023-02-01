package com.nj.udemy.challenge.scope;

import java.util.Scanner;

public class X {
        private final int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        for(int x = 1 ; x < 13; x++) {
            System.out.println(x + " times " + this.x +  " equals " + x * this.x);
        }
    }
}


