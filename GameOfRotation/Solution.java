import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLong();
        }

        // Get PMEAN and sum
        long sum = 0L;
        long pmean = 0L;
        for (int i = 0; i < arr.length; i++) {
            pmean += ((i + 1) * arr[i]);
            sum += arr[i];
        }

        // Get max PMEAN
        long max = pmean;
        for (int i = 0; i < (arr.length - 1); i++) {
            pmean = (pmean - sum) + (arr[i] * (arr.length));
            if (pmean > max) {
                max = pmean;
            }
        }

        System.out.println(max);
    }
}
