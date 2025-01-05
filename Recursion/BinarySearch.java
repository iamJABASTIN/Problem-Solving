package Recursion;

import java.util.Scanner;

public class BinarySearch {

    static int BS(int arr[], int target, int start, int end) {
         
        if(start > end) return -1;
        
        int mid = start+(end-start) / 2;
        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] < target) {
            //start = mid + 1;
            return BS(arr, target, mid+1, end);
        } else {
            //end = mid -1;
            return BS(arr, target, start, mid-1);
        } 
    }
    public static void main(String[] args) {
        int search;
        int []arr = {1,2,3,4,5,6,7,8,9};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values to search: "); 
        search = s.nextInt();
        s.close();
        int ans = BS(arr, search, 0, arr.length-1);
        System.out.println("The output: "+ans);
    }
}
