import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,0,3,-34};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = findMax(arr,0,last);
            swap(arr,max,last); 
        }
    }

    static void swap(int arr[], int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    static int findMax(int[] a,int s, int e) {
        int maxIndex = s;
        for(int i=s;i<=e;i++) {
            if(a[maxIndex] < a[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}