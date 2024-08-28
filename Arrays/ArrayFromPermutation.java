//1920th problem in LEETCODE -- Build Array from Permutation

import java.util.Arrays;

public class ArrayFromPermutation {

    static void arrayFromPermutation(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) ans[i] = arr[arr[i]];
        System.out.println(Arrays.toString(ans)); 
    }
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4}; 
        arrayFromPermutation(arr); // Answer should be 4,5,0,1,2,3
    }

}
