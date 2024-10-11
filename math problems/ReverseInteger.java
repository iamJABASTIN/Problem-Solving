/*
7th problem in LEETCODE  --  Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */

import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        int x, ans;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        x = s.nextInt();
        s.close();
        System.out.println(x);
        ans = reverseInteger(x);
        System.out.println("The output is : " + ans);
    }

    static int reverseInteger(int n) {
        boolean sign = true;
        long rev = 0;
        if (n < 0) {
            sign = false;
            n = Math.abs(n);
        }
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }

        if (!sign)
            return -1 * (int) rev;

        return (int) rev;
    }
}
