import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (isPangram(str)) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

    private static final boolean isPangram(String str) {
        boolean[] tally = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            tally[str.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < tally.length; i++) {
            if (!tally[i]) {
                return false;
            }
        }

        return true;
    }
}
