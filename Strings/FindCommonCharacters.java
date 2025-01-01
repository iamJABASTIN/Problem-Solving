/*
 1002nd problem in LEETCODE  --  Find Common Characters

Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */

import java.util.*;

public class FindCommonCharacters {

    static List<String> findCommonCharacters(String[] words) {
        int minFreq[] = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }

        // System.out.println(Arrays.toString(minFreq));

        for (String word : words) {
            int freq[] = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                list.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String words[] = { "bella", "label", "roller" };
        System.out.println(findCommonCharacters(words));
    }
}
