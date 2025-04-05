// 3rd problem in LEETCODE  --  Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int right = 0, left = 0, maxLen = 0;
        HashSet<Character> seen = new HashSet<>();
        while(right < str.length()) {
            if(!seen.contains(str.charAt(right))){
                seen.add(str.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                seen.remove(str.charAt(left));
                left++;
            }
        } 
        
        System.out.println("The output is: "+maxLen);
    }
}