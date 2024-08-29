// 1295th  -- problem in LEETCODE  --  Find Numbers with Even Number of Digits
public class FindNumbersWithEvenNumberOfDigits {
    static int findNumbersWithEvenNumberOfDigits(int[] arr){
        int count=0,icount;
        for (int i : arr) {
            // if((int)(Math.log10(i)+1) % 2 == 0) count++; <-- optimized solution.
            icount = 0;
            while(i>0){
                i /= 10;
                icount++;
            }
            if (icount%2==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12,323232,345,2,6,7896,22,33,1,143};
        int ans = findNumbersWithEvenNumberOfDigits(arr);
        System.out.println("The answer is: "+ans);
    }
}
