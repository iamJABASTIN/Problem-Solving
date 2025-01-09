/*
 258th problem in LEETCODE  --  Add Digits  (AKA)   Digital Root 

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
 */

public class AddDigits {
    public static void main(String[] args) {
        int num = 387;
        // int digitalRoot = 0;
        // while(num > 0) {
        //     digitalRoot += num % 10;
        //     num /= 10;
        //     if(digitalRoot > 9 && num == 0) {
        //         num = digitalRoot;
        //         digitalRoot = 0;
        //     } 
        // }
        // System.out.println("Digital Root: "+digitalRoot); 
        
        
        //Another Approach for Digital root
        
        if(num == 0) {
            System.out.println("Digital Root: 0"); 
        } else if(num % 9 == 0) {
            System.out.println("Digital Root: "+9); 
        } else{
            System.out.println("Digital Root: "+ num % 9); 
        }
    }
}