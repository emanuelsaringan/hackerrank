import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[N - j - 1] = in.nextInt();
            }
            
            long[] sum = new long[N];
            sum[0] = arr[0];
            for (int j = 1; j < N; j++) {
                sum[j] = sum[j - 1] + arr[j];
            }
            
            long[] dp = new long[N];
            dp[0] = arr[0];
            dp[1] = arr[0] + arr[1];
            dp[2] = arr[0] + arr[1] + arr[2];
            for (int j = 3; j < N; j++) {
                dp[j] = max(
                    (sum[j - 1] - dp[j - 1]) + arr[j],
                    (sum[j - 2] - dp[j - 2]) + arr[j] + arr[j - 1],
                    (sum[j - 3] - dp[j - 3]) + arr[j] + arr[j - 1] + arr[j - 2]
                );
            }
            
            System.out.println(dp[N - 1]);
        }
    }
    
    private static final long max(long...nums) {
        long max = Integer.MIN_VALUE;
        for (long n : nums) {
            if (n > max) {
                max = n;
            }
        }
        
        return max;
    }
}
