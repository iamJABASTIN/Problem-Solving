/* 1480th problem in LEETCODE  --  Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. 
*/

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int[] ans = findRunningSumOf1DArray(arr);
        System.out.println(Arrays.toString(ans));
    }    
    static int[] findRunningSumOf1DArray(int[] arr) {
        int[] ans = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum += arr[i];
            ans[i] = sum;
        }
        return ans;
    }
}
