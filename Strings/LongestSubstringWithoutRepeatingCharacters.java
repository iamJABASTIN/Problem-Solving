
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "acddacbc";
        int right = 0, left = 0, maxLen = 0;
        HashSet<Character> seen = new HashSet<>();
        while(right < str.length()) {
            if(!seen.contains(str.charAt(right))){
                seen.add(str.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                seen.remove(str.charAt(left));
                left++;
            }
        }
        System.out.println("The output is: "+maxLen);  
    }
}