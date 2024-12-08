/*
 2744th problem in LEETCODE  --  Find Maximum Number of String Pairs

You are given a 0-indexed array words consisting of distinct strings.

The string words[i] can be paired with the string words[j] if:

The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.

Example 1:

Input: words = ["cd","ac","dc","ca","zz"]
Output: 2
Explanation: In this example, we can form 2 pair of strings in the following way:
- We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
- We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
It can be proven that 2 is the maximum number of pairs that can be formed.
 */


public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String str[] = {"cd","ac","dc","ca","zz"};
        int count = findMaximumNumberOfStringPairs(str);
        System.out.println("The output : "+ count);
    }

    static int findMaximumNumberOfStringPairs(String[] str) {
        int count = 0;
        String reversed = "";
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i+1; j < str.length; j++) {
                reversed = reverseStr(str[j]);
                if(reversed.equals(str[i])) {
                    count++;
                }
            }
        }
        return count;
    }

    static String reverseStr(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
