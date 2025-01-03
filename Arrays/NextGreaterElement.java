/*
 496th problem in Leetcode  --  Next Greater Element I

The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 */

import java.util.Arrays;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int []arr = new int[len1];
        for(int i=0;i<len1;i++) {
            int idx = -1;
            for(int j=0;j<len2;j++) {
                if(nums1[i] == nums2[j]) {
                    idx = j;
                    break;
                }
            }

            if(idx == len2-1) {
                arr[i] = -1;
                continue;
            }

            for(int k=idx+1;k<len2;k++) {
                if(nums1[i] < nums2[k]) {
                    arr[i] = nums2[k];
                    break;
                } else {
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] n1 = { 4, 1, 2 };
        int[] n2 = { 1, 3, 4, 2 };
        System.out.println("Output : " + Arrays.toString(nextGreaterElement(n1, n2)));
    }
}
