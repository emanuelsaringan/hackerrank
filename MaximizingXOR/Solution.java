import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solve(in.nextInt(), in.nextInt()));
    }

    private static final int solve(int L, int R) {
        int max = 0;
        for (int i = L; i <= R; i++) {
            for (int j = L; j <= R; j++) {
                int xor = i ^ j;
                if (xor > max) {
                    max = xor;
                }
            }
        }

        return max;
    }
}
