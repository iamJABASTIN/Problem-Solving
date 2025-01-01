/*
 2177th problem in LEETCODE  --  Find Three Consecutive Integers That Sum to a Given Number

Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.

 

Example 1:

Input: num = 33
Output: [10,11,12]
Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].

 */

import java.util.Arrays;

public class ThreeConsucativeNumber {

    static int[] find(int num) {
        int sum = 0;
        int divisor = num / 3;
        int result[] = new int[3];
        result[0] = divisor-1;
        result[1] = divisor;
        result[2] = divisor+1;
        for(int i : result) {
            sum += i;
        }
        return (sum==num) ? result : new int[]{};
    }
    public static void main(String[] args) {
        int num = 66;
        System.out.println("The output: "+Arrays.toString(find(num)));
    }
}