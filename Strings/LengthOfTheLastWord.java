/*
58th problem in LEETCODE  --  Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */
public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        System.out.println("The output: " + count);
    }
}
