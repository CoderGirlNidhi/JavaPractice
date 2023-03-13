package com.nj.leetcode;

//https://leetcode.com/problems/design-parking-system/description/

import java.util.Arrays;

/**
 <a href="https://leetcode.com/problems/maximum-units-on-a-truck/">Leetcode Problem</a>
 */
public class MaximumUnitsOnTruck {
    public static int maximumUnits(int[][] array, int truckSize) {
        Arrays.sort(array, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;
        for (int i = 0 ; i < array.length && truckSize != 0; i++) {
            if(truckSize >= array[i][0]) {
                truckSize -= array[i][0];
                totalUnits += array[i][0] * array[i][1];

            }else {
                totalUnits += truckSize * array[i][1];
                truckSize = 0;
            }
        }
        return totalUnits;
    }

    public static int maximumUnits2(int[][] array, int truckSize) {
        Arrays.sort(array, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;

        for (int i = 0; i < array.length && truckSize != 0; i++) {
            if (truckSize >= array[i][0]) {
                truckSize -= array[i][0];
                totalUnits += array[i][0] * array[i][1];
            } else {
                totalUnits += truckSize * array[i][1];
                truckSize = 0;
            }
        }
        return totalUnits;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes, truckSize));

//        int[][][] threeArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
//        Arrays.sort(threeArray, (o1, o2) -> o2[0][0] - o1[0][0]);
//        System.out.println(Arrays.toString(threeArray));

        String[][] input = {{"my", "name", "is", "Gaurav"}, {"my", "name", "is", "Nidhi"}};
        sortTwoDStringArray(input);
    }

    public static void sortTwoDStringArray(String[][] input) {
        Arrays.sort(input, (o1, o2) -> compareStringArrays(o2, o1));
    }

    private static int compareStringArrays(String[] o1, String[] o2) {
        for (int i = 0; i < o1.length; i++) {
            if (o1[i].compareTo(o2[i]) != 0) {
                return o1[i].compareTo(o2[i]);
            }
        }
        return 0;
    }
}
