import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a < minA) {
                minA = a;
            }

            if (b < minB) {
                minB = b;
            }
        }

        System.out.println((long) minA * (long) minB);
    }
}
