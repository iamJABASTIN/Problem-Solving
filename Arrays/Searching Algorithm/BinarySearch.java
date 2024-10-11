import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = s.nextInt();
        int[] arr = new int[limit];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element: ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = s.nextInt();
        s.close();
        int ans = BS(arr, target);
        System.out.println("The element is present in the index "+ans);
    }
    static int BS(int[] arr, int target){
        int start=0, end=arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
