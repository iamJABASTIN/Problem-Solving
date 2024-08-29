//1672nd problem in LEETCODE  --  Richest Customer Wealth

import java.util.Scanner;
import java.util.Arrays;

public class RichestCustomerWealth {

    static int richestCustomerWealth(int[][] arr) {
        int wealth=0,sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            if(sum>wealth){
                wealth = sum;
            }
            sum = 0;
        }
        return wealth;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = input.nextInt();
        int [][]arr = new int[row][row];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter the value in "+i+" - "+j+" psoition: ");
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        int highestWealth = richestCustomerWealth(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The highest wealth is: "+highestWealth);
    }
}