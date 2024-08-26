import java.util.*;
public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range to print fibonacci numbers : ");
        int num = input.nextInt();
        int a = 0,b = 1,c = 0;
        input.close();
        for(int i=2;i<= num;i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
