/*
125th problem in Leetcode  --  Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

public class ValidPalindrome {

    static boolean isValidPlaindrome(String s) {
        int start = 0, end = s.length()-1;
        while (start<=end) {
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        if (isValidPlaindrome(str)) {
            System.out.println("The given string is plaindrome!!");
        } else {
            System.out.println("The given string is not a plaindrome!!");
        }
    }
}
