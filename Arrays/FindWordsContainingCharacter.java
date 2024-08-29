//2942nd problem in LEETCODE  --  Find Words Containing Character
import java.util.*;

public class FindWordsContainingCharacter {

    static void findWordsContainingCharacter(String[] arr, char target) {
        List<Integer> intList = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            // for (char c : arr[i].toCharArray()) {
            //     if(c==target) {
            //         intList.add(i);
            //         break;
            //     }
            // }
            if(arr[i].indexOf(target) != -1) intList.add(i);
        }
        System.out.println(intList);
    }

    public static void main(String[] args) {
        char target = 'a';
        String[] arr = {"abc","bcd","aaaa","cbc"};
        findWordsContainingCharacter(arr, target);
    }
}
