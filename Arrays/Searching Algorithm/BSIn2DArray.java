import java.util.Arrays;

public class BSIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        int target = 45;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int t) {
        int r = arr.length;
        int c = arr[0].length;

        int left = 0;
        int right = r * c - 1;

        while (left <= right) {
            
            int midRow = left + (right - left ) / 2;
            int midEle = arr[midRow / c ][midRow % c];

            if(midEle == t) {
                return new int[]{midRow / c, midRow % c};
            } else if(midEle < t) {
                left = midRow + 1;
            } else {
                right = midRow - 1;
            }

        }
        return new int[]{-1,-1};
    }
}
