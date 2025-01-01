/*

977th problem in Leetcode  --  Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void sortedArray(int[] arr) {
        int left = 0, right, ptr;
        right = ptr = arr.length - 1;
        int result[] = new int[arr.length];
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare > rightSquare) {
                result[ptr] = leftSquare;
                left++;
            } else {
                result[ptr] = rightSquare;
                right--;
            }
            ptr--;
        }
        System.out.println("The output: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        sortedArray(arr);
    }
}
