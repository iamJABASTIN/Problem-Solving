// #231st problem in LEETCODE -- POWER OF TWO

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if(n==0) return false;

        while (n!=1) {
            if(n%2!=0) return false;
            n /= 2;
        }
        return true;
    } 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check the it is the power of two or not : ");
        int num = input.nextInt();
        input.close();
        if(isPowerOfTwo(num)) {
            System.out.println("The given number is a power of two");
        } else {
            System.out.println("The given number is not a power of two");
        }
    }
}
