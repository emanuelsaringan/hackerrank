import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int c = 0; c < T; c++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            Set<Integer> set = new HashSet<Integer>();
            recurse(n - 1, a, b, 0, set);

            boolean first = true;
            for (int num : new TreeSet<Integer>(set)) {
                if (!first) {
                    System.out.print(" ");
                } else {
                    first = false;
                }

                System.out.print(num);
            }

            System.out.println();
        }
    }

    private static final void recurse(int n, int a, int b, int total, Set<Integer> set) {
        if (n <= 0) {
            set.add(total);
            return;
        }

        recurse(n - 1, a, b, total + a, set);
        recurse(n - 1, a, b, total + b, set);
    }
}
