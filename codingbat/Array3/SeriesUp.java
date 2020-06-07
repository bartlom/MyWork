package com.codingbat.Array3;

/*

Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
(spaces added to show the grouping).
Note that the length of the array will be 1 + 2 + 3 ... + n,
which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
seriesUp(3) → [1, 1, 2, 1, 2, 3]	[1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]	[1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]	[1, 1, 2]
seriesUp(1) → [1]	[1]
seriesUp(0) → []	[]
seriesUp(6) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6]
[1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6]

*/

public class SeriesUp {

    public static int seriesUpParametr = 3;

    public static int[] seriesUp(int n) {
        int[] array = new int[n * (n + 1) / 2];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == max) {
                array[i] = 1;
                max++;
            } else {
                array[i] = array[i - 1] + 1;
            }
        }
        return array;
    }

    public static int[] seriesUp2(int n) {
        int[] array = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int ii = 1; ii <= i; ii++) {
                array[index] = ii;
                index++;
            }
        }
        return array;
    }
}
