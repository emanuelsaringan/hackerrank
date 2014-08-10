import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            String nStr = n + "";
            int total = 0;
            for (int j = 0; j < nStr.length(); j++) {
                int curDigit = nStr.charAt(j) - '0';
                if (curDigit != 0 && n % curDigit == 0) {
                    total++;
                }
            }

            System.out.println(total);
        }
    }
}
