package com.codingbat.Array3;

/*

Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
immediately followed by a 4. Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears
in the array before any 4.
fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

*/

public class Fix34 {

    public static int[] tab = new int[]{1, 3, 1, 4};
    public static int[] tab2 = new int[]{1, 3, 1, 4, 4, 3, 1};

    public static int[] fix34Method(int[] nums) {
        int wher3 = 0;
        int wher4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                wher3 = i;
                for (int j = wher4; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        wher4 = j + 1;
                        nums[j] = nums[wher3 + 1];
                        nums[wher3 + 1] = 4;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
