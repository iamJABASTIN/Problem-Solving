/*

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
 */

public class SearchIn2DArrayII {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 111 }
        };

        int target = 111;
        if (search(arr, target)) {
            System.out.println("The target is present in the matrix!!");
        } else {
            System.out.println("The target is not present in the matrix!!");
        }
    }

    static boolean search(int arr[][], int target) {
        int row = 0, col = arr[0].length-1;
        while (row < arr.length && col >= 0) {
            if(arr[row][col] == target) {
                return true;
            } else if(arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
