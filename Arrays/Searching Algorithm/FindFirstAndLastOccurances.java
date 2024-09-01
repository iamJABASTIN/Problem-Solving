// 34th problem in LEETCODE  --  Find First and Last Position of Element in Sorted Array

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5, 7, 7, 8, 8, 8, 8, 8, 10], target = 8
Output: [3,7]
 */

import java.util.Arrays;

public class FindFirstAndLastOccurances {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 8, 8, 10 };
        int target = 8;
        int[] ans = findFirstAndLastOccurances(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findFirstAndLastOccurances(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = searchOccurances(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = searchOccurances(arr, target, false);
        }
        return ans;
    }

    static int searchOccurances(int[] nums, int target, boolean isFist) {
        int ans = -1, start = 0, end = nums.length - 1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                ans = mid;
                if(isFist) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
