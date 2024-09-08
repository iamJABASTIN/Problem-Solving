/*
 2652nd problem in LEETCODE  --  Sum Multiples

Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.

Example 1:

Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 */

public class SumMultiples {
    public static void main(String[] args) {
        int n = 7;
        int sum = 0;
        int inc = 1;
        while(inc <= n) {
            if(inc % 3 == 0 || inc % 5 ==0 || inc % 7 == 0) {
                sum += inc;
            }
            ++inc;
        }
        System.out.println("The output is: "+sum);
    }
}
