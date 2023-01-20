package com.nj.udemy.practice;

import java.util.*;

public class FindZero {
    public static void main(String[] args) {

        int[][] array = {{1, 0, 1}, {2, 3, 4}, {6, 0, 3}, {0, 1, 1}, {0, 0, 0}};
        ArrayList<int[]> result = findZeros(array);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(Arrays.toString(result.get(i)));
        }
        // [[1, 0, 1], [6, 0, 3], [0, 1, 1], [0, 0, 0]]

//        Stack<Integer> obj = new Stack<>();
//        obj.push(1);
//        obj.push(10);
//        System.out.println(obj);
//        int top  = obj.peek();
//        System.out.println(top);
//        System.out.println(obj);
//        int last = obj.pop();
//        System.out.println(last);
//        System.out.println(obj);
//
//        Queue<Integer> objQueue = new LinkedList<>();
//
//
//        ArrayList<Integer> list = new ArrayList<>();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter no of rows you want to print :");
//        int rows = scanner.nextInt();
//        System.out.println("Enter no of columns you want to print :");
//        int cols = scanner.nextInt();
//
//        int[][] nums = new int[rows][cols];
//
//        for(int i = 0; i < rows ; i++){
//            for(int j = 0; j < cols; j++) {
//                nums[i][j] = scanner.nextInt();
//            }
//        }
//        for(int[] array : nums){
//            System.out.println(Arrays.toString(array));
//        }
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static ArrayList<int[]> findZeros(int[][] array) {
        ArrayList<int[]> obj = new ArrayList<>();
        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0 ) {
                    obj.add(array[i]);
                    break;
                }
            }
        }
        return obj;
    }
}