package Recurssion;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return fibo(num - 1) + fibo(num - 2);
    }

    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = s.nextInt();
        s.close();
        System.out.println("Output: " + fibo(num));
    }
}