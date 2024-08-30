//2798th problem in LEETCODE  --  Number of Employees Who Met the Target

import java.util.Scanner;

public class NumberOfEmployeesWhoMetTheTarget {

    static int numberOfEmployeesWhoMetTheTarget(int[] arr, int target){
        int count=0;
        for(int v : arr) if(v>=target) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input limit : ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        System.out.print("Enter the target work hour : ");
        int target = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : ");
            arr[i] = input.nextInt();
        }
        input.close();
        int ans = numberOfEmployeesWhoMetTheTarget(arr, target);
        System.out.println("The answer is: "+ans);
    }
}