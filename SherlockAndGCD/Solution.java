import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int c = 0; c < T; c++) {
            int[] arr = new int[in.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            if (hasCoprime(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static final boolean hasCoprime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (gcd(arr[i], arr[j]) == 1) {
                    return true;
                }
            }
        }

        return false;
    }

    private static final int gcd(int a, int b) {
        int c = a / b;
        int d = a % b;

        while (d != 0) {
            a = b;
            b = d;
            c = a / b;
            d = a % b;
        }

        return b;
    }
}
