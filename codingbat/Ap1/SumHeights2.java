package com.codingbat.Ap1;

public class SumHeights2 {
    /*
    (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.

sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
     */
    public static int[] heights = new int[]{5, 3, 6, 7, 2};
    public static int start = 0;
    public static int end = 4;

    public static int sumHeights2(int[] heights, int start, int end) {
        int result = 0;
        for (int i = start; i + 1 <= end; i++) {
            if (heights[i] >= heights[i + 1])
                result += heights[i] - heights[i + 1];
            else result += 2 * (heights[i + 1] - heights[i]);

        }
        return result;
    }
}
