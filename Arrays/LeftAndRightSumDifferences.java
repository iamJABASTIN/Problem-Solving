/*
 2574th problem in LEETCODE  --  Left and Right Sum Differences

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int arr[] = {10,4,8,3};
        int ans[] = findLeftAndRightSumDifferences(arr);
        System.out.println("The outputis: "+Arrays.toString(ans));
    }

    static int[] findLeftAndRightSumDifferences(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        for (int i = 0; i < len; i++) {
            if(i==0) leftSum[i] = 0;
            else leftSum[i] = leftSum[i - 1] + arr[i - 1];
        }
        for (int i = len - 1; i >= 0; i--) {
            if(i==len-1) rightSum[i] = 0;
            else rightSum[i] = rightSum[i + 1] + arr[i + 1];
        }
        for (int i = 0; i < len; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }

}
