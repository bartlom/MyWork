package com.codingbat.Functional1;

/*

Given a list of integers, return a list where each integer
is added to 1 and the result is multiplied by 10.

math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
math1([]) → []
math1([5, 10]) → [60, 110]
math1([-1, -2, -3, -2, -1]) → [0, -10, -20, -10, 0]
math1([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → [70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30]

*/

import java.util.List;

public class Math1 {

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n->(n+1)*10);
        return nums;
    }
}
