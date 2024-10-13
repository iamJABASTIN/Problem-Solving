/*
74th question in LEETCODE  --  Search a 2D Matrix
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Input: matrix = [   [1,3,5,7],
                    [10,11,16,20],
                    [23,30,34,60]], 
target = 3
Output: true

 */

public class SearchA2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        int target = 45;

        System.out.println("The output : " + search(arr, target));
    }

    static boolean search(int[][] arr, int t) {
        int r = arr.length;
        int c = arr[0].length;

        int left = 0;
        int right = r * c - 1;

        while (left <= right) {

            int midRow = left + (right - left) / 2;
            int midEle = arr[midRow / c][midRow % c];

            if (midEle == t) {
                return true;
            } else if (midEle < t) {
                left = midRow + 1;
            } else {
                right = midRow - 1;
            }

        }
        return false;
    }
}
