import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int M = in.nextInt();
            int N = in.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = in.nextInt();
            }
            
            for (int j = 0; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[j] + arr[k] == M) {
                        System.out.println((j + 1) + " " + (k + 1));
                        break;
                    }
                }
            }
        }
    }
}
