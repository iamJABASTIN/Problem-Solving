import java.util.*;

public class Fibonacci {
    static int findFibo(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1)
            return n;
        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = findFibo(n-1, memo) + findFibo(n-2,memo); 
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value to find nth Fibonacci number: ");
        int n = s.nextInt();
        s.close();
        System.out.println("The output: " + findFibo(n, new HashMap<>()));
    }
}
