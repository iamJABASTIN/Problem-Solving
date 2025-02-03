/*
 3105th problem in LEETCODE  --  Longest Strictly Increasing or Strictly Decreasing Subarray

You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly increasing or strictly decreasing.

Example 1:

Input: nums = [1,4,3,3,2]

Output: 2

Explanation:

The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

Hence, we return 2.
 */

public class LongestIncreasingOrDecresingSubArray {
    static int findMaxLen(int[] arr) {
        int incLen = 1, decLen = 1, maxLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                incLen++;
                decLen = 1;
            } else if (arr[i - 1] > arr[i]) {
                decLen++;
                incLen = 1;
            } else {
                incLen = 1;
                decLen = 1;
            }
            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 3, 2 };
        int ans = findMaxLen(arr);
        System.out.println("Ans : " + ans);
    }
}
