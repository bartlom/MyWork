package com.codingbat.array3;

public class CanBalance {
    /*
    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true


     */

    public static int[] canBalanceArray= new int[]{1, 1, 1, 2, 1};

    static int getSum(int[] array) {
        int sumGetSum = 0;
        int i = 0;
        while (i < array.length) {
            sumGetSum += array[i];
            i++;
        }
        return sumGetSum;
    }

    public static boolean canBalance(int[] nums) {
        boolean result = false;
        int allSum = getSum(nums);
        int sum = 0;
        if (allSum % 2 == 0) {
            for (int i = 0; i < nums.length; i++) {
                if (sum < allSum / 2) sum += nums[i];
                else if (sum == allSum / 2) result = true;
            }
        }
        return result;
    }


}
