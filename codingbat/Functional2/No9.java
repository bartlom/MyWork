package com.codingbat.Functional2;

/*

Given a list of non-negative integers, return a list of those
numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
no9([45, 99, 90, 28, 13, 999, 0]) → [45, 90, 28, 13, 0]
no9([]) → []
no9([9]) → []
no9([0, 9, 0]) → [0, 0]

 */

import java.util.List;

public class No9 {

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> rightmostDigits10(n) == 9);
        return nums;
    }

    public Integer rightmostDigits10(int num) {
        for (int i = 1; i < String.valueOf(num).length(); i++) {
            num = num % 10;
        }
        return num;
    }
}
