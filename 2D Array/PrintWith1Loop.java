/*
 This is the program to display matrix using only single for loop
 */

public class PrintWith1Loop {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row * col; i++) {
            int rowIdx = i / col;
            int colIdx = i % col;
            System.out.print(arr[rowIdx][colIdx] + " ");
            if ((i + 1) % col == 0) {
                System.out.println();
            }
        }
    }
}
