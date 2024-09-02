//852nd problem in LEETCODE  --  Peak Index in a Mountain Array
/*
 You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

Example 1:

Input: arr = [0, 2, 5, 11, 8, 6, 3, 1]

Output: 3
 */
public class PeakIndexInaMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 11, 8, 6, 3, 1};
        int ans = peakIndexInaMountainArray(arr);
        System.out.println("The output is: "+ans);
    }

    static int peakIndexInaMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}