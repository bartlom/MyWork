package com.codingbat.array3;

/*
Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]	[0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]	[0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]	[0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
squareUp(1) → [1]	[1]
squareUp(0) → []	[]
squareUp(6) → [0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1]
[0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1]

*/

public class SquareUp {

    public int[] squareUp(int n) {
        int[] result = new int[n * n];

        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int ii = n; ii >= 1; ii--) {
                if (ii <= i) {
                    result[index] = ii;
                }
                index++;
            }
        }
        return result;
    }
}
