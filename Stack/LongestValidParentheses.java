/*
32nd Leetcode problem  --  Longest Valid Parentheses
Solved
Hard
Topics
Companies
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
substring

Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

*/

package Stack;

import java.util.*;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "()()(())";
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        System.out.println("The Longest Valid Parentheses is: " + ans);
    }
}
