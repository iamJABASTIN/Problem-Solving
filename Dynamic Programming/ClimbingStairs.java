/*
 70th problem in LEETCODE  --  Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
 */

import java.util.HashMap;

public class ClimbingStairs {
    static int climbingStairs(int n, HashMap<Integer, Integer> memo) {
        if(n==0 || n==1) {
            return 1;
        }
        if(!memo.containsKey(n)) {
            memo.put(n, climbingStairs(n-1, memo)+climbingStairs(n-2, memo));
        }
        return memo.get(n);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbingStairs(n, new HashMap<>()));
    }
}
