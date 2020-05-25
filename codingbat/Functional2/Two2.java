package com.codingbat.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    /*
    Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]

     */
    public static List<Integer> two2(List<Integer> nums) {
        nums = (List<Integer>) nums.stream()
                .map(n -> n * 2).filter(n -> rightmostDigits10(n) != 2)
                .collect(Collectors.toList());
        return nums;
    }

    public static Integer rightmostDigits10(int num) {
        for (int i = 1; i < String.valueOf(num).length(); i++) {
            num = num % 10;
        }
        return num;
    }
}
