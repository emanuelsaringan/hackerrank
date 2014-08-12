import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] C = new int[N];

        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }

        Arrays.sort(C);

        long result = 0;
        int idx = N - 1;
        int mult = 1;
        while (idx >= 0) {
            result += (C[idx--] * mult);
            if (((N - idx) - 1) % K == 0) {
                mult++;
            }
        }

        System.out.println(result);
    }
}
