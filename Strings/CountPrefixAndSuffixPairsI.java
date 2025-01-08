/*
 3042nd problem on LEETCODE  --   Count Prefix and Suffix Pairs I

You are given a 0-indexed string array words.

Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:

isPrefixAndSuffix(str1, str2) returns true if str1 is both a 
prefix and a suffix of str2, and false otherwise.

For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.

Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true.

Example 1:

Input: words = ["a","aba","ababa","aa"]
Output: 4
Explanation: In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
Therefore, the answer is 4.
 */

public class CountPrefixAndSuffixPairsI {

    static boolean isPrefixAndSuffix(String s1, String s2) {
        if(s2.startsWith(s1) && s2.endsWith(s1)) {
            return true;
        }
        return false;
    }

    static int countPrefixSuffixPairs(String words[]) {
        int count = 0;
        for(int i=0;i<words.length;i++) {
            for(int j=i+1;j<words.length;j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String words[] = {"pa","papa","ma","mama"};
        int ans = countPrefixSuffixPairs(words);
        System.out.println("The total count: "+ans);
    }
}
