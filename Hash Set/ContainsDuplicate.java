/*
217th problem in LEETCODE  --  Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
 */

import java.util.HashSet;

public class ContainsDuplicate {
    static boolean isContainsDuplicate(int[] arr) {
        HashSet<Integer> numsSet = new HashSet<>();
        for(int i : arr) {
            if(!numsSet.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        if(isContainsDuplicate(arr)) {
            System.out.println("The give array contains duplicate elements.");
        } else {
            System.out.println("The give array contains distinct elements.");
        }
    }
}
