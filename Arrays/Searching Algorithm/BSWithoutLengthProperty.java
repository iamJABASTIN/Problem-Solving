import java.util.Scanner;

public class BSWithoutLengthProperty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the item: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        input.close();
        int ans = findIndexUsingBSWithoutLength(arr, target);
        System.out.println("The output is: " + ans);
    }

    static int findIndexUsingBSWithoutLength(int[] arr, int target) {
        int start = 0;
        int end = 1, temp = 0;
        while (arr[end] < target) {
            temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
