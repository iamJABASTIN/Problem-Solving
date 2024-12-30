/*
2016th problem in Leetcode  --  Maximum Difference Between Increasing Elements

Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

Return the maximum difference. If no such i and j exists, return -1.

Example 1:

Input: nums = [7,1,5,4]
Output: 4
Explanation:
The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
 */

public class MaximumDifference {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 4 };
        int leftMin = arr[0];
        int max = -1;
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            if (leftMin < val) {
                max = Math.max(max, val - leftMin);
            }
            leftMin = Math.min(leftMin, val);
        }
        System.out.println("The Maximum Difference Between Increasing Elements is: " + max);
    }
}
