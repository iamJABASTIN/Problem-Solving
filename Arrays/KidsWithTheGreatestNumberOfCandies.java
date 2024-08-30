//1431st problem in LEETCODE  --  Kids With the Greatest Number of Candies

import java.util.*;
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        int extraCandies = 1;
        kidsWithTheGreatestNumberOfCandies(arr,extraCandies);
    }
    static void kidsWithTheGreatestNumberOfCandies(int[] arr,int extraCandies){
        List<Boolean> boolList = new ArrayList<>();
        int maxCandies = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxCandies = Math.max(arr[i], maxCandies);
        }
        for(int i : arr) boolList.add( (i+extraCandies) >= maxCandies);
        System.out.println(boolList);
    }
}
