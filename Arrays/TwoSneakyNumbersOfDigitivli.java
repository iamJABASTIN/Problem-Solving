import java.util.Arrays;

/**
 * 3289th problem in LEETCODE -- The Two Sneaky Numbers of Digitville
 * 
 * In the town of Digitville, there was a list of numbers called nums containing
 * integers from 0 to n - 1. Each number was supposed to appear exactly once in
 * the list, however, two mischievous numbers sneaked in an additional time,
 * making the list longer than usual.
 * 
 * As the town detective, your task is to find these two sneaky numbers. Return
 * an array of size two containing the two numbers (in any order), so peace can
 * return to Digitville.
 * 
 * Example 3:
 * 
 * Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
 * 
 * Output: [4,5]
 * 
 * Explanation:
 * 
 * The numbers 4 and 5 each appear twice in the array.
 */
public class TwoSneakyNumbersOfDigitivli {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2 };
        int[] ans = findSneakers(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findSneakers(int[] arr){
        Arrays.sort(arr);
        int[] ans = new int[2];
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]) {
                ans[j++] = arr[i];
            }
        }
        return ans;
    }
}