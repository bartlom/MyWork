package com.codingbat.Recursion1;

public class Count7 {

/*

Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
(no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0

*/

    public static int count7(int n) {
        int check = 7;
        if (n < 10) {
            return rightmostDigits10(n, check);
        }
        return rightmostDigits10(n, check) + count7(n / 10);
    }

    public static int rightmostDigits10(int fullNumber, int check) {
        int countResult = 0;
        if (fullNumber % 10 == check) {
            countResult++;
        }
        return countResult;
    }


}
