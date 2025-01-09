/*
 709th problem in LEETCODE  --  To Lower Case

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:

Input: s = "Hello"
Output: "hello"
 */

public class ToLowerCase {
    public static void main(String[] args) {
        String str = "HeLlO, WoRlD";
        StringBuilder ans = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                ans.append((char) (32 + c));
            } else {
                ans.append(c);
            }
        }
        System.out.println("The output: " + ans);
    }
}
