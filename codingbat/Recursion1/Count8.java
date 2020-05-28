package com.codingbat.Recursion1;

public class Count8 {

/*

Given a non-negative int n, compute recursively (no loops)
the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count8(8) → 1
count8(818) → 2
count8(8818) → 4

*/

    public static int count8(int n) {
        int check = 8;
        if (n < 100) return rightmostDigits10(n, check) + rightmostDigits10(n / 10, check);
        return rightmostDigits10(n, check) + count8(n / 10);
    }

    public static int rightmostDigits10(int fullNumber, int check) {
        int countResult = 0;
        if (fullNumber % 10 == check && (fullNumber / 10) % 10 == check) countResult = +2;
        else if (fullNumber % 10 == check) countResult++;
        return countResult;
    }
}
