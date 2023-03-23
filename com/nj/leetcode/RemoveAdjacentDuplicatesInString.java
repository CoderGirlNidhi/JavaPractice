package com.nj.leetcode;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {
     private static final Stack<Character> stack = new Stack<>();
     private static final  StringBuilder b = new StringBuilder();
    public static String removeDuplicates(String s) {

        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }else {
                stack.add(s.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            b.append(stack.pop());
        }

        return b.reverse().toString();

    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

}
