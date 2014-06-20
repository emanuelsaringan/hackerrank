import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            String line = in.next();

            if (line.length() % 2 == 1) {
                System.out.println(-1);
            } else {
                System.out.println(solve(line));
            }
        }
    }
    
    private static final int solve(String line) {
        int count = 0;

        int midIdx = line.length() / 2;
        String left = line.substring(0, midIdx);
        String right = line.substring(midIdx);
        
        int[] tallyLeft = new int[26];
        int[] tallyRight = new int[26];

        for (int i = 0; i < left.length(); i++) {
            tallyLeft[left.charAt(i) - 'a']++;
            tallyRight[right.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            count += Math.abs(tallyLeft[i] - tallyRight[i]);
        }

        return count / 2;
    }
}
