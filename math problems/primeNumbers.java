import java.util.Scanner;

class primeNumbers {

    public static boolean isPalindrome(int num) {
        int start = 2;
        int count = 0;
        if(start <= num) {
            for(int i=start;i<=num;i++) {
                if(num%i==0){
                    ++count;
                }
            }
        }
        if(count == 1) {
            return true;
        }
        return false;
    }


    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number to find it palindrome or not : ");
        int num = s.nextInt();
        s.close();
        boolean ans = isPalindrome(num);
        if(ans) {
            System.out.println("The given number "+num+" is a PRIME number!!");
        } else {
            System.out.println("The given number "+num+" is not a PRIME number!!");
        }
    }
}