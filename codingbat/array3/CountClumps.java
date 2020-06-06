package com.codingbat.array3;

/*

Say that a "clump" in an array is a series of 2 or more
adjacent elements of the same value.
Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
countClumps([1, 2, 3]) → 0
countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4
countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4
countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5
countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5
countClumps([]) → 0

*/

public class CountClumps {

    public static int[] ClumpsTab = new int[]{1, 2, 2, 3, 4, 4};

    public static int countClumps(int[] nums) {
        int count = 0;
        int current = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1] && (nums[i] != current || (i - 1 > 0 && nums[i] != nums[i - 1]))) {
                current = nums[i];
                count++;
            } else if (i + 1 < nums.length && nums[i] != nums[i + 1]) {
                current = -1;
            }
        }
        return count;
    }


}