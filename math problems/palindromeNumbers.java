import java.util.*;
public class palindromeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check it is palindrome : ");
        int num = input.nextInt();
        input.close();
        int rev=0, rem = 0, temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /10;
        }
        System.out.println( (temp == rev ? "PALINDROME" : "NOT A PALINDROME") );
    }
}
