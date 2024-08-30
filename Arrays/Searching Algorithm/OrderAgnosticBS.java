// If we don't know wheather the array is sorted in asscending or descending then we use this approach.

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        input.close();
        int ans = orderAgnosticBS(arr, target);
        System.out.println("Array Element in the index: " + ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if(isAsc) {
                if(arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if(arr[mid] > target)  start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}