import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        int[] tally = new int[26];
        
        for (int i = 0; i < line.length(); i++) {
            tally[line.charAt(i) - 'a']++;
        }
        
        int numOdd = 0;
        for (int i = 0; i < 26; i++) {
            if (tally[i] % 2 == 1) {
                numOdd++;
            }
        }
        
        if (line.length() % 2 == 0) {
            System.out.println(numOdd == 0 ? "YES" : "NO");
        } else {
            System.out.println(numOdd == 1 ? "YES" : "NO");
        }
    }
}
