import java.util.*;
public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit of the array list: ");
        int limit = s.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter the value for " +i+" position : ");
            list.add(s.nextInt());
        }
        s.close();
        System.out.println(list);
    }
}
