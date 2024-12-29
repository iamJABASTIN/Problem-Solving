/*
 20th problem in Leetcode  --  Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Input: s = "()[]{}"

Output: true
 */

package Stack;

public class ValidParenthese {

    static char[] stack = new char[100];
    static int top = -1;

    public static void push(char c) {
        stack[++top] = c;
    }

    public static char pop() {
        return stack[top--];
    }

    public static void main(String[] args) {
        String str = "([]{})";
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                push(c);
            } else {
                char poppedEle = pop();
                if (poppedEle == '\0')
                    System.out.println("It's not a valid parenthese...");
                if ((c == ')' && poppedEle != '(') ||
                        (c == '}' && poppedEle != '{') ||
                        (c == ']' && poppedEle != '[')) {
                    System.out.println("It's not a valid parenthese...");
                }
            }
        }
        // if (top == -1) {
        // System.out.println("The given string have a valid parenthese...");
        // } else {
        // System.out.println("The given string not have a valid parenthese...");
        // }

        System.out.println(top == -1 ? "The given string have a valid parenthese..."
                : "The given string not have a valid parenthese...");
    }
}