/*
 2733rd problem in LEETCODE  --  Neither Minimum nor Maximum
Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.

Example 1:

Input: nums = [2,1]
Output: 2
Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
 */

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        int[] arr = { 2, 1 };
        int ans = findNeitherMinimumNorMaximum(arr);
        System.out.println("The output is: " + ans);
    }

    static int findNeitherMinimumNorMaximum(int[] arr) {
        Arrays.sort(arr);
        if (arr.length > 2)
            return arr[1];
        return -1;
    }
}
