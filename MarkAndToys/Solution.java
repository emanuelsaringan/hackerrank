import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        Arrays.sort(prices);

        int answer = 0;
        for (int i = 0; i < prices.length; i++) {
            k -= prices[i];

            if (k >= 0) {
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}
