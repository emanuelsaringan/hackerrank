import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int[] A = new int[in.nextInt()];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
            if (A[i] < min) {
                min = A[i];
            }
        }

        int[] B = new int[in.nextInt()];
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
            if (B[i] < min) {
                min = B[i];
            }
        }

        final int MAX_DIFF = 101;

        int[] tallyA = new int[MAX_DIFF];
        for (int i = 0; i < A.length; i++) {
            tallyA[A[i] - min]++;
        }

        int[] tallyB = new int[MAX_DIFF];
        for (int i = 0; i < B.length; i++) {
            tallyB[B[i] - min]++;
        }

        for (int i = 0; i < MAX_DIFF; i++) {
            if (tallyA[i] != tallyB[i]) {
                System.out.print((min + i) + " ");
            }
        }
    }
}
