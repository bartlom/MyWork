package com.codingbat.Functional1;

import java.util.List;

public class RightDigit {
    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]


     */

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> rightmostDigits10(n));
        return nums;
    }

    public static Integer rightmostDigits10(int num) {
        for (int i = 1; i < String.valueOf(num).length(); i++) {
            num = num % 10;
        }
        return num;
    }

}
