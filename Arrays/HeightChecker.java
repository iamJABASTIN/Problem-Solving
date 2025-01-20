/*
 1051st Problem in LEETCODE  --  Height Checker

A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
 */

public class HeightChecker {

    static int heightChecker(int[] heights) {
        int count = 0;
        int currHeight = 0;
        int[] heightsToFreq = new int[101]; //Because of the constraints we 101 size

        for(int height : heights) {
            heightsToFreq[height]++;
        }


        for(int i=0;i<heights.length;i++) {
            while(heightsToFreq[currHeight] == 0) {
                currHeight++;
            }

            if(currHeight != heights[i]) {
                count++;
            }

            heightsToFreq[currHeight]--;
        }
        return count;
    }
    public static void main(String[] args) {
        int []heights = {1,1,4,2,1,3};
        System.out.println("The output: "+heightChecker(heights));
    }
}
