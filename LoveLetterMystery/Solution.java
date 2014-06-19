import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(solve(in.next()));
        }
    }

    private static final int solve(String line) {
        char[] lineChars = line.toCharArray();

        char minChar = 'z';
        for (int i = 0; i < lineChars.length; i++) {
            if (lineChars[i] < minChar) {
                minChar = lineChars[i];
            }
        }

        for (int i = 0; i < lineChars.length; i++) {
            lineChars[i] -= minChar;
        }

        int count = 0;
        for (int i = 0; i < lineChars.length / 2; i++) {
            char left = lineChars[i];
            char right = lineChars[lineChars.length - 1 - i];

            count += Math.abs(left - right);
        }

        return count;
    }
}
