/*
 1684th problem in LEETCODE  --   Count the Number of Consistent Strings
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 */

public class CountTheNumberOfConsistentStrings {
    static int countTheNumberOfConsistentStrings(String allowed, String words[]) {
        int count = words.length;
        allowed = allowed.toLowerCase();
        int []charMap = new int[26];

        for(char c : allowed.toCharArray()) {
            charMap[c-'a']++;
        }

        for(String str : words) {
            for(char c : str.toCharArray()) {
                if(charMap[c-'a'] <= 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String words[] = {"ad","bd","aaab","baa","badab"};
        int consistentStrings = countTheNumberOfConsistentStrings(allowed, words);
        System.out.println("Consistent Strings : "+consistentStrings);
    }
}
