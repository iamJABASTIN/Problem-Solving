//Simple program with 2D array
package Matrix;

import java.util.Scanner;

public class SimpleMatrixProblem {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        row = input.nextInt();
        System.out.println();
        System.out.print("Enter the column : ");
        col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the value for " + i + " " + j + " position : ");
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Array element in "+i+" "+j+" position is "+arr[i][j]);
            }
        }
    }
}
