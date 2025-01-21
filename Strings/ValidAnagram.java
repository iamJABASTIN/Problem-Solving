/*
242nd problem on LEETCODE  --  Valid Anagram

Given two strings s and t, return true if t is an 
anagram of s, and false otherwise.


Example 1:

Input: s = "anagram", t = "nagaram"

Output: true
 */


public class ValidAnagram {

    static boolean isAnagram(String s, String t) {
        int[] freqArr = new int[26];
        for(char c : s.toCharArray()) {
            freqArr[c-'a']++;
        }
        for(char c : t.toCharArray()) {
            freqArr[c-'a']--;
        }
        for(int i : freqArr) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t)?"The give strings is anagram":"The given Strings not an anagram");
    }    
}
