public class DifferentColumnSize {
    public static void main(String[] args) {
        int [][]arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        // System.out.println(Arrays.toString(arr[0]));
        // System.out.println(arr[2].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Array element in "+i+" "+j+" position is "+arr[i][j]);       
            }
        }
    }
}
