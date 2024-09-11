/*
 2951st problem in LEETCODE  --  Find the Peaks
You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.

Return an array that consists of indices of peaks in the given array in any order.

Notes:

A peak is defined as an element that is strictly greater than its neighboring elements.
The first and last elements of the array are not a peak.

Example 2:

Input: mountain = [1,4,3,8,5]
Output: [1,3]
Explanation: mountain[0] and mountain[4] can not be a peak because they are first and last elements of the array.
mountain[2] also can not be a peak because it is not strictly greater than mountain[3] and mountain[1].
But mountain [1] and mountain[3] are strictly greater than their neighboring elements.
So the answer is [1,3].
 */

import java.util.*;

public class FindTheAllPeaks {

    static List<Integer> findTheAllPeaks(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1] && arr[i] > arr[i-1]) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,8,5};
        List<Integer> ans = findTheAllPeaks(arr);
        System.out.println("The output is: "+ans);
    }
}
