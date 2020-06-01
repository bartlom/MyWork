package com.codingbat.Recursion1;

public class Array6 {


/*

Given an array of ints, compute recursively if the array contains a 6.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array.
The initial call will pass in index as 0.

array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
array6([], 0) → false
array6([6, 2, 2], 0) → true
array6([2, 5], 0) → false
array6([1, 9, 4, 6, 6], 0) → true
array6([2, 5, 6], 0) → true

*/

    public static boolean array6(int[] nums, int index) {

        if (index == nums.length)
            return false;

        int search = 6;

        if (checkArrayContainsInt(nums, index, search)) return true;

        return array6(nums, index + 1);
    }

    public static boolean checkArrayContainsInt(int[] array, int index, int search) {
        return (array[index] == search);
    }

}
