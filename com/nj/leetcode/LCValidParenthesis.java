package com.nj.leetcode;

import java.util.Stack;
/*
 * if open bracket -> push to stack
 * else
 *       check if the top of stack is the compliment of current close bracket
 *       if it is the same -> stack pop
 *       else return false
 * if stack is empty -> return true
 * else return false
 * */

public class LCValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid(("[")));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c :s.toCharArray()){
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else{
                if(stack.isEmpty()) {
                    System.out.println("String is invalid");
                    return false;
                }
                char topCharacter = stack.peek();
                char complimentBracket = compliment(c);
                if(topCharacter == complimentBracket) {
                    stack.pop();
                }else {
                    System.out.println("String is invalid");
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("String is valid");
            return true;
        }
        return false;
    }

    public static char compliment(char c) {
        switch(c) {
            case ')' : return '(';
            case ']' : return '[' ;
            case '}' : return '{' ;
        };
        return c;
    }
}
