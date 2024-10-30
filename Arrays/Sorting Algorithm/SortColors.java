/*
 75th problem in LEETCODE  --  Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int index = nums.length - 1 - i;
            int maxValueIdx = findMaxValueIdx(nums,0,index);
            swap(nums,index,maxValueIdx);
            System.out.println(Arrays.toString(nums));
        }
    }

    static int findMaxValueIdx(int[] nums, int s, int e) {
        int maxIndex = s;
        for (int i = 0; i <= e; i++) {
            if(nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] nums,int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
