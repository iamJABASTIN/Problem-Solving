/*
33rd problem in LEETCODE  --  Search in Rotated Sorted Array

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4 
 */


public class SearchInRotatedSortedArray {

    static boolean binarySearch(int arr[], int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    static int findPivot(int arr[]) {
        int start = 0, end = arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                return mid;
            } else if(arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = findPivot(nums);
        boolean ans = binarySearch(nums, target, 0, pivot);
        if(!ans) {
            ans = binarySearch(nums, target, pivot+1, nums.length-1);
        }
        if(ans) {
            System.out.println("Target is present in the array");
        } else {
            System.out.println("Target is not present in the array");
        }
    }
}