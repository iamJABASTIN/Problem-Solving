/*
 2413rd problem in LEETCODE  --  Smallest Even Multiple
Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 
Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
 */

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        int n = 6;
        int ans = 1;
        while (true) {
            if (ans % 2 == 0 && ans % n == 0)
                break;
            ans++;
        }
        System.out.println("The output is: " + ans);
    }
}
