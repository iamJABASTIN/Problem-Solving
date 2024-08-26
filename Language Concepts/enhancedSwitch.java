import java.util.*;;

public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num to find its day : ");
        int num = input.nextInt();
        input.close();
        switch(num) {
            case 1 -> { 
                System.out.println("Sunday");
                System.out.println("FUN DAY!!!");
            }
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");  
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Firday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter a valid data!!");
        }
    }
}
