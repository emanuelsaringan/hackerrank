import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int[] arr = new int[N];
            int[] tally = new int[N + 1];
            for (int j = 0; j < N; j++) {
                arr[j] = in.nextInt();
                tally[arr[j]]++;
            }
            
            int availableCount = 0;
            long total = 1;
            for (int j = 0; j < N; j++) {
                availableCount += tally[j];
                total = (total * availableCount) % 1000000007;
                availableCount--;
            }
            
            System.out.println(total);
        }
    }
}
