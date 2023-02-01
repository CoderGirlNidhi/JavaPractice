package com.nj.udemy.challenge.scope;

import java.util.Scanner;

public class ScopeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no : " );
        X x = new X(scanner.nextInt());
        x.x();
    }
}
