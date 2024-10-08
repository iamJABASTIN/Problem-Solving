// 35th problem in LEETCODE  --  Search Insert Position
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 7;
        int ans = searchInsertPosition(arr, target);
        System.out.println("The output is: " + ans);
    }

    static int searchInsertPosition(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
