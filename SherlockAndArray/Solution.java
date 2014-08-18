import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();

            int[] arr = new int[N + 2];
            int[] left = new int[N + 2];
            int[] right = new int[N + 2];

            for (int j = 1; j <= N; j++) {
                arr[j] = in.nextInt();
            }

            for (int j = 1; j <= N; j++) {
                left[j] = left[j - 1] + arr[j];
            }

            for (int j = N; j >= 1; j--) {
                right[j] = arr[j] + right[j + 1];
            }

            boolean found = false;

            for (int j = 1; j <= N; j++) {
                if (left[j - 1] == right[j + 1]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
