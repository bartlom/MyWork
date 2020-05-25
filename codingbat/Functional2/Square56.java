package com.codingbat.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    /*
    Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
     */

    public List<Integer> square56(List<Integer> nums) {
        nums = (List<Integer>) nums
                .stream().map(n -> n * n + 10)
                .filter(n -> rightmostDigits10(n) != 5 && rightmostDigits10(n) != 6)
                .collect(Collectors.toList());
        return nums;
    }

    Integer rightmostDigits10(int num) {
        for (int i = 1; i < String.valueOf(num).length(); i++) {
            num = num % 10;
        }
        return num;
    }
}