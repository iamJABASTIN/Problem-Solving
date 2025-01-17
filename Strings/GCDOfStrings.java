/*
 1071st problem in LEETCODE  --  Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
 */

public class GCDOfStrings {
    static String findGCDOfStrings(String s1, String s2) {
        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }

        int gcdLength = GCD(s1.length(), s2.length());
        return s1.substring(0, gcdLength);
    }

    static int GCD(int a, int b) {
        return (b == 0) ? a : GCD(b, a % b);
    }

    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";
        System.out.println("The output: " + findGCDOfStrings(s1, s2));
    }
}
