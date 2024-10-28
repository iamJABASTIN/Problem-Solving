import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        boolean isSwapped;
        int[] arr = {7,3,5,2,1};
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }    
            }

            if(!isSwapped) {
                break; //If the loop runs without swaped then, it'll be sorted.
            }

        }
        System.out.println(Arrays.toString(arr));
    }    
}
