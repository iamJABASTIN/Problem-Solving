/*
 162nd problem in LEETCODE  --  Find Peak Element
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5
Explanation: 3 is a peak element and your function should return the index number 2.
 */

public class FindPeakElementInZigZagArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        int ans = findPeakElementInZigZagArray(arr);
        System.out.println("The output is: " + ans);
    }

    static int findPeakElementInZigZagArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
