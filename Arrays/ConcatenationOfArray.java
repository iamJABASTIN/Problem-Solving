//1929th problem in LEETCODE -- Concatenation of Array

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {

    static void concatenationOfArray(int arr[]) {
        int len = arr.length, j=0;
        int []ans = new int[len * 2];
        for(int i=0;i<ans.length;i++) {
            ans[i] = arr[j];
            ++j;
            if(len==j) j = 0;
        }
        System.out.println(Arrays.toString(ans));
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int limit = input.nextInt();
        int []arr = new int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter the value for "+i+" position : ");
            arr[i] = input.nextInt();
        }
        input.close();
        concatenationOfArray(arr);
    }
}
