package com.codingbat.Array3;

/*

Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear
in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact
that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
inearIn([1, 2, 4, 6], [2, 4]) → true	false
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
linearIn([2, 2, 4, 4, 6, 6], [2, 4]) → true
linearIn([2, 2, 2, 2, 2], [2, 2]) → true
linearIn([2, 2, 2, 2, 2], [2, 4]) → false
linearIn([2, 2, 2, 2, 4], [2, 4]) → true
linearIn([1, 2, 3], [2]) → true
linearIn([1, 2, 3], [-1]) → false
linearIn([1, 2, 3], []) → true
linearIn([-1, 0, 3, 3, 3, 10, 12], []) → true
linearIn([-1, 0, 3, 3, 3, 10, 12], []) → false
linearIn([], [-1, 10, 11]) → false

*/

public class LinearIn {

    public static int[] inner = new int[]{-1, 0, 3, 3, 3, 10, 12};
    public static int[] outer = new int[]{0, 3, 10, 12};

    public static boolean linearIn(int[] outer, int[] inner) {
        int many = 0;
        for (int i = 0; i < inner.length; i++) {
            if (inner[i] == outer[many]) many++;
        }
        System.out.println(many);
        return (many >= outer.length);
    }
}
