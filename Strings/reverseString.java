// #344th problem in LEETCODE
// In this approach we use Two pointer.

import java.util.Scanner;

public class reverseString {
    public static void fun(char arr[]) {
        System.out.println("Before reversing the string");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int len = arr.length;
        int leftPointer = 0;
        int rightPointer = len - 1;
        char temp;
        while(leftPointer < rightPointer) {
            temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;
            ++leftPointer;
            --rightPointer;
        }
        System.out.println("\nAfter reversing the string");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String []args) {
        int limit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        limit = s.nextInt();
        char []arr = new char[limit];
        System.out.println("Enter the characters to reverse : ");
        for(int i=0;i<limit;i++) {
            System.out.print("Enter character " + (i + 1) + " : ");
            arr[i] = s.next().charAt(0);
        }
        s.close();
        fun(arr);
    }
}
