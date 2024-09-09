/*
 2824th problem in LEETCODE  --  Count Pairs Whose Sum is Less than Target

Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 
Example 1:

Input: nums = [-1,1,2,3,1], target = 2
Output: 3
Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
- (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target 
- (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
 */

import java.util.List;

public class CountPairsWhoseSumLessThanTarget {
    public static void main(String[] args) {
        List<Integer> list = List.of(-1, 1, 2, 3, 1);
        int target = 2;
        int ans = findCountPairsWhoseSumLessThanTarget(list, target);
        System.out.println("The output is: " + ans);
    }

    static int findCountPairsWhoseSumLessThanTarget(List<Integer> list, int target) {
        int ans = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if ((i < j) && list.get(i) + list.get(j) < target)
                    ans++;
            }
        }
        return ans;
    }
}